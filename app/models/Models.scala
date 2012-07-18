package models;

import java.util.{Date}

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._


case class Category(id: Pk[Long] = NotAssigned, description: String)
case class Issue(id: Pk[Long] = NotAssigned, number: String, categoryid: Long, resolution: String, fixedondate: Option[Date])

object Category{
	
  val simple = {
  	get[Pk[Long]]("category.id") ~
  	get[String]("category.description") map{
  		case id~description => Category(id,description)
  	}
  }

  def findById(id: Long): Option[Category] = {
    DB.withConnection { implicit connection =>
      SQL("select * from category where id = {id}").on('id -> id).as(Category.simple.singleOpt)
    }
  }

  def options: Seq[(String,String)] = DB.withConnection { implicit connection =>
    SQL("select * from category order by description").as(Category.simple *).map(c => c.id.toString -> c.description)
  }

  def list: List[Category] ={
  	DB.withConnection { implicit connection =>
  		SQL("select * from category").as(Category.simple *)
  	}
  }
  
  def insert(category: Category) = {
  	DB.withConnection { implicit connection =>
  		SQL(
  			"""
  			insert into category values (
  				(select next value for category_seq),
  				{description}
  				)
  			"""
  		).on(
  			'description -> category.description
  		).executeUpdate()
  	}
  }

  def update(id: Long, category: Category) = {
  	DB.withConnection { implicit connection =>
  		SQL(
  			"""
  			update category set description = {description} where id={id}
  			"""
  		).on(
  			'id -> id,
  			'description -> category.description
  		).executeUpdate()
  	}
  }

  def delete(id: Long) {
  	DB.withConnection { implicit connection =>
  		SQL(
  			"""
  			delete from category where id = {id}
  			"""
  		).on(
  			'id -> id
  		).executeUpdate()
  	}
  }

}

object Issue{
  
  val simple = {
    get[Pk[Long]]("issue.id") ~
    get[String]("issue.number") ~
    get[Long]("issue.categoryid") ~
    get[String]("issue.resolution") ~
    get[Option[Date]]("issue.fixedondate") map{
      case id~number~categoryid~resolution~fixedondate => Issue(id,number,categoryid,resolution,fixedondate)
    }
  }  

  val withCategory = Issue.simple ~ (Category.simple ?) map {
    case issue~category => (issue,category)
  }

  def findById(id: Long): Option[Issue] = {
    DB.withConnection { implicit connection =>
      SQL("select * from issue where id = {id}").on('id -> id).as(Issue.simple.singleOpt)
    }
  }

  def list: List[(Issue,Option[Category])] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
        select * from issue join category on issue.categoryid=category.id 
        where month(issue.fixedondate) = month(now()) 
        order by issue.fixedondate
        """
      ).as(Issue.withCategory *)
    }
  }

  def report: List[(Int,Long)] = {
    DB.withConnection { implicit connection =>
      SQL(
        """ 
        select month(fixedondate) as month, count(*) as count 
        from issue join category on issue.categoryid=category.id 
        where year(fixedondate) = year(now()) group by (month(fixedondate))
        """
      )().map(row =>
        row[Int]("month") -> row[Long]("count")
      ).toList
    }
  }

  def search(year: String, month: String): List[(Issue,Option[Category])] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
        select * from issue join category on issue.categoryid=category.id
        where month(issue.fixedondate) = {month}
        and year(issue.fixedondate) = {year}
        order by issue.fixedondate
        """
      ).on('month -> month, 'year -> year).as(Issue.withCategory *)
    }

  }
  
  def insert(issue: Issue) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
        insert into issue values (
          (select next value for issue_seq),
            {number},
            {categoryid},
            {resolution},
            {fixedondate}
          )
        """
      ).on(
        'number -> issue.number,
        'categoryid -> issue.categoryid,
        'resolution -> issue.resolution,
        'fixedondate -> issue.fixedondate
      ).executeUpdate()
    }
  }

  def update(id: Long, issue: Issue) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
        update issue set number = {number}, categoryid = {categoryid}, resolution = {resolution}, fixedondate = {fixedondate} where id={id}
        """
      ).on(
        'id -> id,
        'number -> issue.number,
        'categoryid -> issue.categoryid,
        'resolution -> issue.resolution,
        'fixedondate -> issue.fixedondate
      ).executeUpdate()
    }
  }

  def delete(id: Long) {
    DB.withConnection { implicit connection =>
      SQL(
        """
          delete from issue where id = {id}
        """
      ).on(
          'id -> id
      ).executeUpdate()
    }
  }


}

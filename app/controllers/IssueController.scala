package controllers;

import java.util.{Calendar}
import play.api._
import play.api.mvc._

import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._

import scala.collection.immutable._
import anorm._
import models._
import views.html.issue._

import play.api.libs.json._

object IssueController extends Controller{

	val issueForm = Form(
	  mapping(
	  	"id" -> ignored(NotAssigned:Pk[Long]),
	    "number" -> nonEmptyText,
	    "categoryid" -> longNumber,
	    "resolution" -> nonEmptyText,
	    "fixedondate" -> optional(date("dd-MM-yyyy"))
	  )(Issue.apply)(Issue.unapply)
	)

  val issueSearchForm = Form(
    tuple(
      "year" -> nonEmptyText,
      "month" -> nonEmptyText
    )
  )

	def issues = Action{
		Ok(index(Issue.list))
	}	
    
	def create = Action {
		Ok(createform(issueForm))
	}

	def edit(id: Long) = Action{  		
  		Issue.findById(id).map { issue =>
      		Ok(editform(id,issueForm.fill(issue)))
    	}.getOrElse(NotFound)  		
  }

  def update(id: Long) = Action { implicit request =>
    	issueForm.bindFromRequest.fold(
      		formWithErrors => BadRequest(editform(id, formWithErrors)),
      		issue => {
        		Issue.update(id, issue)
        		Redirect(routes.IssueController.issues)
      		}
    	)
  }

  	def save = Action { implicit request =>
  		issueForm.bindFromRequest.fold(
      		formWithErrors => BadRequest(createform(formWithErrors)),
      		issue => {
        		Issue.insert(issue)
        		Redirect(routes.IssueController.issues)
      		}
    	)
  	}

    val months: Map[String, String]= ListMap(
        "1" -> "January", "2" -> "February",
        "3" -> "March", "4" -> "April", 
        "5" -> "May", "6" -> "June",
        "7" -> "July", "8" -> "August",
        "9" -> "September", "10" -> "October",
        "11" -> "November", "12" -> "December")

    def monthOptions(): Map[String,String] = months    
    
    def yearOptions(): List[String] = {        
        val calendar: Calendar = Calendar.getInstance();
        var curyear: Int=calendar.get(Calendar.YEAR);
        List(curyear.toString, (curyear-1).toString, (curyear-2).toString, (curyear-3).toString, (curyear-4).toString)
    }

    def get_search = Action { implicit request =>
      val curData = Map("year" -> Calendar.getInstance().get(Calendar.YEAR).toString, "month" -> (Calendar.getInstance().get(Calendar.MONTH)+1).toString)      
      Ok(searchform(issueSearchForm.bind(curData)))
    }

    def search = Action { implicit request =>
      val isForm = issueSearchForm.bindFromRequest()
      val (year, month) = isForm.get
      val issues: List[(Issue, Option[Category])]=Issue.search(year,month)
      Ok(searchform(isForm,issues))
    }
	
}
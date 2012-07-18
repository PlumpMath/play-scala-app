package controllers

import play.api._
import play.api.mvc._

import play.api.data._
import play.api.data.Forms._

import anorm._

import models._

import views.html.category._

object CategoryController extends Controller {

	val categoryForm = Form(
	  mapping(
	  	"id" -> ignored(NotAssigned:Pk[Long]),
	    "description" -> nonEmptyText
	  )(Category.apply)(Category.unapply)
	)
    
	def categories = Action {
		Ok(index(Category.list))
	}

	def create = Action {
		Ok(createform(categoryForm))
	}

	def edit(id: Long) = Action{  		
  		Category.findById(id).map { category =>
      		Ok(editform(id,categoryForm.fill(category)))
    	}.getOrElse(NotFound)  		
  }

  def update(id: Long) = Action { implicit request =>
    	categoryForm.bindFromRequest.fold(
      		formWithErrors => BadRequest(editform(id, formWithErrors)),
      		category => {
        		Category.update(id, category)
        		Redirect(routes.CategoryController.categories)
      		}
    	)
  }

  	def save = Action { implicit request =>
  		categoryForm.bindFromRequest.fold(
      		formWithErrors => BadRequest(createform(formWithErrors)),
      		category => {
        		Category.insert(category)
        		Redirect(routes.CategoryController.categories)
      		}
    	)
  	}
  
}

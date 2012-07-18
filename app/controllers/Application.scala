package controllers

import play.api._
import play.api.mvc._
import models.Issue;
import scala.collection.immutable._

object Application extends Controller {

	val months: Map[String, String]= ListMap(
	    "1" -> "January", "2" -> "February",
	    "3" -> "March", "4" -> "April", 
	    "5" -> "May", "6" -> "June",
	    "7" -> "July", "8" -> "August",
	    "9" -> "September", "10" -> "October",
	    "11" -> "November", "12" -> "December")

	def get_month(monthnr: Int): String = months(monthnr.toString)
	
	def index = Action {
		Ok(views.html.index(Issue.report))
	}  
  
}

package views.html.category

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object createform extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(categoryForm: Form[models.Category]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main()/*6.8*/ {_display_(Seq[Any](format.raw/*6.10*/("""
	"""),_display_(Seq[Any](/*7.3*/form(action = routes.CategoryController.save)/*7.48*/ {_display_(Seq[Any](format.raw/*7.50*/("""
		"""),_display_(Seq[Any](/*8.4*/category/*8.12*/.form("Create Category",categoryForm))),format.raw/*8.49*/("""
	""")))})),format.raw/*9.3*/("""
""")))})))}
    }
    
    def render(categoryForm:Form[models.Category]) = apply(categoryForm)
    
    def f:((Form[models.Category]) => play.api.templates.Html) = (categoryForm) => apply(categoryForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 12 08:27:56 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/category/createform.scala.html
                    HASH: b99fc480b0977d1ea4ae5bebf7d614e09687c117
                    MATRIX: 534->1|665->38|695->60|734->65|747->71|786->73|824->77|877->122|916->124|955->129|971->137|1029->174|1063->178
                    LINES: 19->1|23->1|25->4|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9
                    -- GENERATED --
                */
            
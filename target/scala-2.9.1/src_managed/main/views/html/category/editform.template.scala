
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
object editform extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[models.Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, categoryForm: Form[models.Category]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main()/*6.8*/ {_display_(Seq[Any](format.raw/*6.10*/("""
	"""),_display_(Seq[Any](/*7.3*/form(action = routes.CategoryController.update(id))/*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
		"""),_display_(Seq[Any](/*8.4*/category/*8.12*/.form("Update Category",categoryForm))),format.raw/*8.49*/("""
	""")))})),format.raw/*9.3*/("""
""")))})))}
    }
    
    def render(id:Long,categoryForm:Form[models.Category]) = apply(id,categoryForm)
    
    def f:((Long,Form[models.Category]) => play.api.templates.Html) = (id,categoryForm) => apply(id,categoryForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 11 11:25:30 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/category/editform.scala.html
                    HASH: ed6951628811d533f6f8e7bdd12e97f8be387f08
                    MATRIX: 537->1|678->48|708->70|747->75|760->81|799->83|837->87|896->138|935->140|974->145|990->153|1048->190|1082->194
                    LINES: 19->1|23->1|25->4|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9
                    -- GENERATED --
                */
            
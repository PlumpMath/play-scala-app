
package views.html.issue

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
object editform extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[models.Issue],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, issueForm: Form[models.Issue]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main()/*6.8*/ {_display_(Seq[Any](format.raw/*6.10*/("""
	"""),_display_(Seq[Any](/*7.3*/form(action = routes.IssueController.update(id))/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
		"""),_display_(Seq[Any](/*8.4*/issue/*8.9*/.form("Update Issue",issueForm))),format.raw/*8.40*/("""
	""")))})),format.raw/*9.3*/("""
""")))})))}
    }
    
    def render(id:Long,issueForm:Form[models.Issue]) = apply(id,issueForm)
    
    def f:((Long,Form[models.Issue]) => play.api.templates.Html) = (id,issueForm) => apply(id,issueForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 13 11:06:24 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/issue/editform.scala.html
                    HASH: 9b3260cc70ecf93b781ffdccb22d66f4513f346c
                    MATRIX: 531->1|666->42|696->64|735->69|748->75|787->77|825->81|881->129|920->131|959->136|971->141|1023->172|1057->176
                    LINES: 19->1|23->1|25->4|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9
                    -- GENERATED --
                */
            
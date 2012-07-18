
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
object createform extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.Issue],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(issueForm: Form[models.Issue]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main()/*6.8*/ {_display_(Seq[Any](format.raw/*6.10*/("""
	"""),_display_(Seq[Any](/*7.3*/form(action = routes.IssueController.save)/*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/("""
		"""),_display_(Seq[Any](/*8.4*/issue/*8.9*/.form("Create Issue",issueForm))),format.raw/*8.40*/("""
	""")))})),format.raw/*9.3*/("""
""")))})))}
    }
    
    def render(issueForm:Form[models.Issue]) = apply(issueForm)
    
    def f:((Form[models.Issue]) => play.api.templates.Html) = (issueForm) => apply(issueForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 13 11:03:19 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/issue/createform.scala.html
                    HASH: 46eadc0d0b7bc8ad99f6b12b596ddf134ae58c70
                    MATRIX: 528->1|653->32|683->54|722->59|735->65|774->67|812->71|862->113|901->115|940->120|952->125|1004->156|1038->160
                    LINES: 19->1|23->1|25->4|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9
                    -- GENERATED --
                */
            
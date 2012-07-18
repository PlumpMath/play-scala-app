
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
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[models.Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String,categoryForm: Form[models.Category]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*4.1*/("""
<table class="table">
    <thead>
    	<tr><th>"""),_display_(Seq[Any](/*7.15*/title)),format.raw/*7.20*/("""</th></tr>
    </thead>	
    <tbody>	
    <tr>	    	
    	<td>"""),_display_(Seq[Any](/*11.11*/inputText(field=categoryForm("description"), args = 'class -> "input-large", 'placeholder -> "description", '_label -> "Description"))),format.raw/*11.144*/("""		
    	</td>
    </tr>
    </tbody>
    <tfoot>
	<tr>
    	<td><button type="submit" class="btn btn-primary">Save</button></td> 	
    </tr>	
	</tfoot>
</table>"""))}
    }
    
    def render(title:String,categoryForm:Form[models.Category]) = apply(title,categoryForm)
    
    def f:((String,Form[models.Category]) => play.api.templates.Html) = (title,categoryForm) => apply(title,categoryForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 13 11:03:19 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/category/form.scala.html
                    HASH: 5621737fd93a8c19186dd22e8435953adde62ebf
                    MATRIX: 535->1|680->52|710->74|797->126|823->131|926->198|1082->331
                    LINES: 19->1|23->1|25->4|28->7|28->7|32->11|32->11
                    -- GENERATED --
                */
            
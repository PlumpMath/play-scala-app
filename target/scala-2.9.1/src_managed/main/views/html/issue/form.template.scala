
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
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[models.Issue],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String, issueForm: Form[models.Issue]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
<table class="table">
    <thead>
    	<tr><th  colspan="2">"""),_display_(Seq[Any](/*7.28*/title)),format.raw/*7.33*/("""</th></tr>
    </thead>	
    <tbody>	
    <tr>	    	
    	<td>"""),_display_(Seq[Any](/*11.11*/inputText(field=issueForm("number"), args = 'class -> "input-large", 'placeholder -> "number", '_label -> "Jira Issue"))),format.raw/*11.130*/("""		
    	</td>           
        <td>
            """),_display_(Seq[Any](/*14.14*/select(field=issueForm("categoryid"), 
                models.Category.options, 
                '_label -> "Category", 
                '_default -> "-- Choose a category --"))),format.raw/*17.56*/("""        
        </td>
    </tr>
    <tr>            
        <td>"""),_display_(Seq[Any](/*21.14*/textarea(field=issueForm("resolution"), args = 'rows -> 3, 'cols -> 50, 'class -> "input-large", 'placeholder -> "ressolution", '_label -> "Resolution"))),format.raw/*21.166*/("""        
        </td>               
        <td>
            """),_display_(Seq[Any](/*24.14*/inputText(field=issueForm("fixedondate"), args = 'class -> "input-large", '_label -> "Fixed on Date"))),format.raw/*24.115*/("""
        </td>
    </tr>
    </tbody>
    <tfoot>
	<tr>
    	<td colspan="2"><button type="submit" class="btn btn-primary">Save</button></td> 	
    </tr>	
	</tfoot>
</table>

<script type="text/javascript">
    $(function() """),format.raw("""{"""),format.raw/*36.19*/("""
        $("#fixedondate").datepicker("""),format.raw("""{"""),format.raw/*37.39*/("""dateFormat:"dd-mm-yy""""),format.raw("""}"""),format.raw/*37.61*/(""");
        
        $("#fixedondate").keypress(function() """),format.raw("""{"""),format.raw/*39.48*/("""
                return false;
        """),format.raw("""}"""),format.raw/*41.10*/(""");
        
    """),format.raw("""}"""),format.raw/*43.6*/(""");
</script>"""))}
    }
    
    def render(title:String,issueForm:Form[models.Issue]) = apply(title,issueForm)
    
    def f:((String,Form[models.Issue]) => play.api.templates.Html) = (title,issueForm) => apply(title,issueForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 17 06:49:02 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/issue/form.scala.html
                    HASH: 3c0b1a9fd8814c34d4c5047e532b05446f632eec
                    MATRIX: 529->1|669->47|699->69|799->134|825->139|928->206|1070->325|1160->379|1361->558|1468->629|1643->781|1746->848|1870->949|2154->1186|2241->1226|2310->1248|2418->1309|2507->1351|2572->1370
                    LINES: 19->1|23->1|25->4|28->7|28->7|32->11|32->11|35->14|38->17|42->21|42->21|45->24|45->24|57->36|58->37|58->37|60->39|62->41|64->43
                    -- GENERATED --
                */
            
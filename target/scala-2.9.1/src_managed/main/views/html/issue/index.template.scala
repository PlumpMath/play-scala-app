
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[scala.Tuple2[models.Issue, Option[models.Category]]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(issues: List[(models.Issue, Option[models.Category])]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(Seq[Any](/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

	<table class="table table-striped table-bordered table-condensed">
	    <thead>	        
	        <tr>
	            <th>Number</th>            
	            <th>Category</th>
	            <th>Fixed on Date</th>
	        </tr>        
	    </thead>	     
	    <tbody>	

	    	"""),_display_(Seq[Any](/*15.8*/issues/*15.14*/.map/*15.18*/ {/*16.17*/case (issue, category) =>/*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""		    
			    <tr>	    	             
			    	<td>
			    		<a id="issuenr" href=""""),_display_(Seq[Any](/*19.33*/routes/*19.39*/.IssueController.edit(issue.id.get))),format.raw/*19.74*/("""" rel="tooltip" data-original-title=""""),_display_(Seq[Any](/*19.112*/issue/*19.117*/.resolution)),format.raw/*19.128*/(""""/>"""),_display_(Seq[Any](/*19.132*/issue/*19.137*/.number)),format.raw/*19.144*/("""</a>
			    	</td> 		    	
			    	<td>
			    		"""),_display_(Seq[Any](/*22.11*/category/*22.19*/.get.description)),format.raw/*22.35*/("""
			    	</td> 		    	
			    	<td>
			    		"""),_display_(Seq[Any](/*25.11*/issue/*25.16*/.fixedondate.map(_.format("dd-MM-yyyy")).getOrElse/*25.66*/ {_display_(Seq[Any](format.raw/*25.68*/(""" <em>-</em> """)))})),format.raw/*25.81*/("""
			    	</td> 		    	
			    </tr>	    
				""")))}})),format.raw/*29.5*/("""
	 	</tbody>
	 	<tfoot>
	 		<tr>
	 			<td colspan="3"><a href=""""),_display_(Seq[Any](/*33.32*/routes/*33.38*/.IssueController.create)),format.raw/*33.61*/("""" class="btn btn-primary">Add</a></td>
	 		</tr>
	 	</tfoot>	        
	</table>

	<script type="text/javascript">
		$(function()"""),format.raw("""{"""),format.raw/*39.16*/("""
			$("a#issuenr").tooltip();
		"""),format.raw("""}"""),format.raw/*41.4*/(""")
	</script>

""")))})))}
    }
    
    def render(issues:List[scala.Tuple2[models.Issue, Option[models.Category]]]) = apply(issues)
    
    def f:((List[scala.Tuple2[models.Issue, Option[models.Category]]]) => play.api.templates.Html) = (issues) => apply(issues)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 18 07:17:39 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/issue/index.scala.html
                    HASH: a8516c1ca158460488f935bfd1a64e9905ff68de
                    MATRIX: 562->1|694->56|733->61|746->67|785->69|1111->360|1126->366|1139->370|1150->391|1184->416|1224->418|1346->504|1361->510|1418->545|1493->583|1508->588|1542->599|1583->603|1598->608|1628->615|1717->668|1734->676|1772->692|1857->741|1871->746|1930->796|1970->798|2015->811|2096->866|2200->934|2215->940|2260->963|2442->1098|2523->1133
                    LINES: 19->1|22->1|24->3|24->3|24->3|36->15|36->15|36->15|36->16|36->16|36->16|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|42->22|42->22|42->22|45->25|45->25|45->25|45->25|45->25|48->29|52->33|52->33|52->33|58->39|60->41
                    -- GENERATED --
                */
            
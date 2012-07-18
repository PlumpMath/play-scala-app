
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
object searchform extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},List[scala.Tuple2[models.Issue, Option[models.Category]]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(issueSearchForm: Form[_], issues: List[(models.Issue,Option[models.Category])] = null):play.api.templates.Html = {
        _display_ {import helper._

import models._

import controllers._


Seq[Any](format.raw/*1.89*/("""

"""),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/main()/*7.8*/ {_display_(Seq[Any](format.raw/*7.10*/("""
	
	"""),_display_(Seq[Any](/*9.3*/form(action = routes.IssueController.search)/*9.47*/ {_display_(Seq[Any](format.raw/*9.49*/("""
		<table class="table">
	    <thead>
	    	<tr><th colspan="2">Search Issues</th></tr>
	    </thead>	
	    <tbody>	
	    <tr>	    	
	    	<td>
	    		"""),_display_(Seq[Any](/*17.9*/select(field=issueSearchForm("year"), options = options(IssueController.yearOptions()), args= '_label -> "Year"))),format.raw/*17.121*/("""
	    	</td> 
	    	<td>
	    		"""),_display_(Seq[Any](/*20.9*/select(field=issueSearchForm("month"), options = options(IssueController.monthOptions()), args= '_label -> "Month"))),format.raw/*20.124*/("""
	    	</td>	    	
	    </tr>	
		</tbody>
		<tfoot>
		<tr>
	    	<td colspan="2"><button id="searchbtn" type="submit" class="btn btn-primary">Search</button></td> 	
	    </tr>	
		</tfoot>
		</table>
	""")))})),format.raw/*30.3*/("""

	"""),_display_(Seq[Any](/*32.3*/if(issues!=null)/*32.19*/ {_display_(Seq[Any](format.raw/*32.21*/("""

		<table class="table table-striped table-bordered table-condensed">
		    <thead>	        
		        <tr>
		            <th>Number</th>            
		            <th>Category</th>
		            <th>Fixed on Date</th>
		        </tr>        
		    </thead>	     
		    <tbody>	

		    	"""),_display_(Seq[Any](/*44.9*/issues/*44.15*/.map/*44.19*/ {/*45.18*/case (issue, category) =>/*45.43*/ {_display_(Seq[Any](format.raw/*45.45*/("""		    
				    <tr>	    	             
				    	<td>
				    		"""),_display_(Seq[Any](/*48.12*/issue/*48.17*/.number)),format.raw/*48.24*/("""
				    	</td> 		    	
				    	<td>
				    		"""),_display_(Seq[Any](/*51.12*/category/*51.20*/.get.description)),format.raw/*51.36*/("""
				    	</td> 		    	
				    	<td>
				    		"""),_display_(Seq[Any](/*54.12*/issue/*54.17*/.fixedondate.map(_.format("dd-MM-yyyy")).getOrElse/*54.67*/ {_display_(Seq[Any](format.raw/*54.69*/(""" <em>-</em> """)))})),format.raw/*54.82*/("""
				    	</td> 		    	
				    </tr>	    
					""")))}})),format.raw/*58.6*/("""
		 	</tbody>		 	
		</table>

		<script type="text/javascript">
			$(function()"""),format.raw("""{"""),format.raw/*63.17*/("""
				$("a#issuenr").tooltip();
			"""),format.raw("""}"""),format.raw/*65.5*/(""")
		</script>

	""")))})),format.raw/*68.3*/("""
	

""")))})))}
    }
    
    def render(issueSearchForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},issues:List[scala.Tuple2[models.Issue, Option[models.Category]]]) = apply(issueSearchForm,issues)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},List[scala.Tuple2[models.Issue, Option[models.Category]]]) => play.api.templates.Html) = (issueSearchForm,issues) => apply(issueSearchForm,issues)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 18 07:21:36 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/issue/searchform.scala.html
                    HASH: 6847470f43b5b785f2408605515ce673ed9f4774
                    MATRIX: 648->1|870->88|900->151|937->154|950->160|989->162|1030->169|1082->213|1121->215|1316->375|1451->487|1522->523|1660->638|1902->849|1943->855|1968->871|2008->873|2344->1174|2359->1180|2372->1184|2383->1206|2417->1231|2457->1233|2560->1300|2574->1305|2603->1312|2691->1364|2708->1372|2746->1388|2834->1440|2848->1445|2907->1495|2947->1497|2992->1510|3076->1569|3208->1654|3291->1691|3342->1711
                    LINES: 21->1|29->1|31->6|32->7|32->7|32->7|34->9|34->9|34->9|42->17|42->17|45->20|45->20|55->30|57->32|57->32|57->32|69->44|69->44|69->44|69->45|69->45|69->45|72->48|72->48|72->48|75->51|75->51|75->51|78->54|78->54|78->54|78->54|78->54|81->58|86->63|88->65|91->68
                    -- GENERATED --
                */
            
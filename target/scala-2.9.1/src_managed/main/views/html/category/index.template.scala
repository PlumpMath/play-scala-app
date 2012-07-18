
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(categories: List[models.Category]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

"""),_display_(Seq[Any](/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

	<table class="table table-striped table-bordered table-condensed">
	    <thead>	        
	        <tr>
	            <th>Description</th>            
	        </tr>        
	    </thead>	     
	    <tbody>	
		    """),_display_(Seq[Any](/*12.8*/for(category <- categories) yield /*12.35*/ {_display_(Seq[Any](format.raw/*12.37*/("""	
			    <tr>	    	             
			    	<td>
			    		<a href=""""),_display_(Seq[Any](/*15.20*/routes/*15.26*/.CategoryController.edit(category.id.get))),format.raw/*15.67*/("""">"""),_display_(Seq[Any](/*15.70*/category/*15.78*/.description)),format.raw/*15.90*/("""</a>
			    	</td> 		    	
			    </tr>	    
			""")))})),format.raw/*18.5*/("""
	 	</tbody>
	 	<tfoot>
	 		<tr>
	 			<td><a href=""""),_display_(Seq[Any](/*22.20*/routes/*22.26*/.CategoryController.create)),format.raw/*22.52*/("""" class="btn btn-primary">Add</a></td>
	 		</tr>
	 	</tfoot>	        
	</table>

""")))})))}
    }
    
    def render(categories:List[models.Category]) = apply(categories)
    
    def f:((List[models.Category]) => play.api.templates.Html) = (categories) => apply(categories)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 12 08:27:56 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/category/index.scala.html
                    HASH: 386b43603eda9c639c0255e86e22b435e94fcae9
                    MATRIX: 529->1|641->36|680->41|693->47|732->49|992->274|1035->301|1075->303|1179->371|1194->377|1257->418|1296->421|1313->429|1347->441|1430->493|1522->549|1537->555|1585->581
                    LINES: 19->1|22->1|24->3|24->3|24->3|33->12|33->12|33->12|36->15|36->15|36->15|36->15|36->15|36->15|39->18|43->22|43->22|43->22
                    -- GENERATED --
                */
            
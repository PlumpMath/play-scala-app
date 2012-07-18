
package views.html.common

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
object sidebar extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<ul class="nav nav-list">   
    <li class="nav-header">KISS</li>
	<li lid="category"><a href=""""),_display_(Seq[Any](/*3.31*/routes/*3.37*/.CategoryController.categories)),format.raw/*3.67*/(""""><i class="icon-star-empty"></i>Category</a></li>
	<li lid="issue"><a href=""""),_display_(Seq[Any](/*4.28*/routes/*4.34*/.IssueController.issues)),format.raw/*4.57*/(""""><i class="icon-star-empty"></i>Issue</a></li>

    <li class="divider"></li>
    <li class="nav-header">Report</li>
    <li lid="search"><a href=""""),_display_(Seq[Any](/*8.32*/routes/*8.38*/.IssueController.get_search)),format.raw/*8.65*/(""""><i class="icon-cog"></i>Search Issues</a></li>    

</ul>

<script type="text/javascript">
	$(function()"""),format.raw("""{"""),format.raw/*13.15*/("""
		var url=$(location).attr('href');
		var links=$("li[lid]");
		$("li.active").attr("class","");
		$.each(links,function(i,liobject)"""),format.raw("""{"""),format.raw/*17.37*/("""
			var linkid=$(this).attr("lid");
			if(url.indexOf("/"+linkid)>=0)"""),format.raw("""{"""),format.raw/*19.35*/("""
				$(liobject).attr("class","active");				
			"""),format.raw("""}"""),format.raw/*21.5*/("""
		"""),format.raw("""}"""),format.raw/*22.4*/(""");			
	"""),format.raw("""}"""),format.raw/*23.3*/(""");
</script>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 17 12:19:39 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/common/sidebar.scala.html
                    HASH: 64c9a1a5f4d8da9ab4b46b02fabc0984951ca600
                    MATRIX: 578->0|711->98|725->104|776->134|890->213|904->219|948->242|1136->395|1150->401|1198->428|1357->540|1542->678|1661->750|1758->801|1809->806|1864->815
                    LINES: 22->1|24->3|24->3|24->3|25->4|25->4|25->4|29->8|29->8|29->8|34->13|38->17|40->19|42->21|43->22|44->23
                    -- GENERATED --
                */
            
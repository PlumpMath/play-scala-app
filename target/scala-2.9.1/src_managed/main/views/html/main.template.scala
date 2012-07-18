
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/()(content: Html):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*4.1*/("""
<!DOCTYPE html>

<html>
<head>
    <title>KISS Production Maintenance</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("stylesheets/smoothness/jquery-ui-1.8.21.custom.css"))),format.raw/*10.120*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.50*/routes/*11.56*/.Assets.at("stylesheets/ui.jqgrid.css"))),format.raw/*11.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.50*/routes/*12.56*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.99*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.50*/routes/*13.56*/.Assets.at("stylesheets/main.css"))),format.raw/*13.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*14.55*/routes/*14.61*/.Assets.at("images/favicon.png"))),format.raw/*14.93*/("""">
    <script src=""""),_display_(Seq[Any](/*15.19*/routes/*15.25*/.Assets.at("javascripts/jquery-1.7.2.min.js"))),format.raw/*15.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("javascripts/jquery-ui-1.8.21.custom.min.js"))),format.raw/*16.81*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*17.19*/routes/*17.25*/.Assets.at("javascripts/jquery.jqGrid.min.js"))),format.raw/*17.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*18.19*/routes/*18.25*/.Assets.at("javascripts/i18n/grid.locale-en.js"))),format.raw/*18.73*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*19.67*/("""" type="text/javascript"></script>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div style="margin-left:10px;margin-right:10px">
                <a class="brand" href=""""),_display_(Seq[Any](/*26.41*/routes/*26.47*/.Application.index)),format.raw/*26.65*/("""">KISS</a>
                <p class="navbar-text pull-right">
                    ADMIN
                </p>                
            </div>
        </div>
    </div>
        
    <div class="container" style="margin-top:10px">
        <div class="row">
		    <div class="span3"><!--Sidebar content-->
                <div class="well">
		    	     """),_display_(Seq[Any](/*38.14*/common/*38.20*/.sidebar())),format.raw/*38.30*/("""                
                </div>
		    </div>
		    <div class="span9"><!--Body content-->
                <div class="well">
		    	     """),_display_(Seq[Any](/*43.14*/content)),format.raw/*43.21*/("""
                </div>
		    </div>
	    </div>
	</div>
</body>
</html>

"""))}
    }
    
    def render(content:Html) = apply()(content)
    
    def f:(() => (Html) => play.api.templates.Html) = () => (content) => apply()(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 17 16:18:48 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/main.scala.html
                    HASH: 0b84bed2ab1dfb1445c35ddc703b8491836d4a52
                    MATRIX: 502->1|612->18|640->37|804->165|819->171|906->235|994->287|1009->293|1070->332|1158->384|1173->390|1238->433|1326->485|1341->491|1397->525|1490->582|1505->588|1559->620|1616->641|1631->647|1698->692|1787->745|1802->751|1880->807|1969->860|1984->866|2052->912|2141->965|2156->971|2226->1019|2315->1072|2330->1078|2394->1120|2738->1428|2753->1434|2793->1452|3182->1805|3197->1811|3229->1821|3411->1967|3440->1974
                    LINES: 19->1|23->1|25->4|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|47->26|47->26|47->26|59->38|59->38|59->38|64->43|64->43
                    -- GENERATED --
                */
            
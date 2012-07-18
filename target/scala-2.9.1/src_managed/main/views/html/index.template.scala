
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[scala.Tuple2[Int, Long]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(reportList: List[(Int,Long)]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),_display_(Seq[Any](/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""
    
    <script type="text/javascript">
      google.load("visualization", "1", """),format.raw("""{"""),format.raw/*6.42*/("""packages:["corechart"]"""),format.raw("""}"""),format.raw/*6.65*/(""");
      google.setOnLoadCallback(drawChart);
      function drawChart() """),format.raw("""{"""),format.raw/*8.29*/("""
        var data = google.visualization.arrayToDataTable([
          ['Month', 'Nr. Of Issues']
          """),_display_(Seq[Any](/*11.12*/for((monthnr: Int, count: Long) <- reportList) yield /*11.58*/{_display_(Seq[Any](format.raw/*11.59*/("""
          	,['"""),_display_(Seq[Any](/*12.16*/controllers/*12.27*/.Application.get_month(monthnr))),format.raw/*12.58*/("""',  """),_display_(Seq[Any](/*12.63*/count)),format.raw/*12.68*/("""]
          """)))})),format.raw/*13.12*/("""
        ]);

        var options = """),format.raw("""{"""),format.raw/*16.24*/("""
          title: 'Production Issues - """),_display_(Seq[Any](/*17.40*/java/*17.44*/.util.Calendar.getInstance().get(java.util.Calendar.YEAR))),format.raw/*17.101*/("""',
          hAxis: """),format.raw("""{"""),format.raw/*18.19*/("""title: 'Months', titleTextStyle: """),format.raw("""{"""),format.raw/*18.53*/("""color: 'red'"""),format.raw("""}"""),format.raw("""}"""),format.raw/*18.67*/("""
        """),format.raw("""}"""),format.raw/*19.10*/(""";

        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      """),format.raw("""}"""),format.raw/*23.8*/("""
    </script>

    <div id="chart_div" style="height: 400px;"></div>
    
""")))})))}
    }
    
    def render(reportList:List[scala.Tuple2[Int, Long]]) = apply(reportList)
    
    def f:((List[scala.Tuple2[Int, Long]]) => play.api.templates.Html) = (reportList) => apply(reportList)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 17 16:23:29 CEST 2012
                    SOURCE: D:/m22135/play/app.ws/prod-issues/app/views/index.scala.html
                    HASH: 38c1448301489b7e010114eed64b16dd8140e5e9
                    MATRIX: 528->1|635->31|672->34|685->40|724->42|853->125|922->148|1042->222|1186->330|1248->376|1287->377|1339->393|1359->404|1412->435|1453->440|1480->445|1525->458|1609->495|1685->535|1698->539|1778->596|1846->617|1927->651|2007->665|2064->675|2251->816
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|29->8|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|34->13|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|44->23
                    -- GENERATED --
                */
            

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*7.62*/("""
        """),format.raw/*8.9*/("""<title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.70*/("""" type="text/javascript"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" />
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
		<nav calss="navbar navbar-inverse">
			<div class="navbar-header">
				<a class="navbar-brand" href="/">Lab 2</a>
			</div>
<ul class="nav navbar-nav">
	<li><a href=""""),_display_(/*21.16*/routes/*21.22*/.HomeController.index()),format.raw/*21.45*/("""">Home</a></li>
	<li><a href=""""),_display_(/*22.16*/routes/*22.22*/.HomeController.about()),format.raw/*22.45*/("""">About Us</a></li>
	<li><a href=""""),_display_(/*23.16*/routes/*23.22*/.HomeController.products()),format.raw/*23.48*/("""">Products</a></li>
</ul>
	</nav>
  <div class="container-fluid text-center">
	    
    """),_display_(/*28.6*/content),format.raw/*28.13*/("""

    """),format.raw/*30.5*/("""<footer class="container-fluid text-center">
      <p></p>
    </footer>

    </div>


    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 12:59:20 GMT 2016
                  SOURCE: /home/wdd/webapps/lab2/app/views/main.scala.html
                  HASH: 1b657c84056fc3f07e96bd6c47aadb6510f2b14a
                  MATRIX: 748->2|873->32|901->34|980->139|1015->148|1049->156|1074->161|1162->223|1176->229|1238->270|1326->331|1341->337|1402->376|1454->401|1469->407|1531->448|1974->864|1989->870|2033->893|2091->924|2106->930|2150->953|2212->988|2227->994|2274->1020|2389->1109|2417->1116|2450->1122
                  LINES: 27->2|32->2|34->4|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|58->28|58->28|60->30
                  -- GENERATED --
              */
          
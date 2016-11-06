
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("About")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
    """),format.raw/*2.5*/("""<div class="row">
	<div class="col-sm-2">
	<div class="well">
		<h4>Menu</h4>
		</div>

	</div>
      <div class="col-sm-10">
        <div class="well">
          <h4>About Us</h4>
        </div>
      </div>
    </div>
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 12:49:55 GMT 2016
                  SOURCE: /home/wdd/webapps/lab2/app/views/about.scala.html
                  HASH: b134be486b916be9fef6427139648a8583207144
                  MATRIX: 827->1|848->14|887->16|918->21|1169->242
                  LINES: 32->1|32->1|32->1|33->2|46->15
                  -- GENERATED --
              */
          
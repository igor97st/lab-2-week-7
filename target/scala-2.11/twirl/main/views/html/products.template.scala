
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Product")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*2.5*/("""<div class="row">
	<div class="col-sm-2">
	<div class="well">
		<h4>Menu</h4>
		</div>

	</div>
      <div class="col-sm-10">
        <div class="well">
          <h4>Products Page</h4>
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
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 12:49:55 GMT 2016
                  SOURCE: /home/wdd/webapps/lab2/app/views/products.scala.html
                  HASH: 13bf779589e63a546b691e7f552f4efb34c235c9
                  MATRIX: 833->1|856->16|895->18|926->23|1182->249
                  LINES: 32->1|32->1|32->1|33->2|46->15
                  -- GENERATED --
              */
          

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),_display_(/*2.2*/main("Home")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
    """),format.raw/*3.5*/("""<div class="row">
	<div class="col-sm-2">
	<div class="well">
		<h4>Menu</h4>
		</div>

	</div>
      <div class="col-sm-12">
        <div class="well">
          <h4>"""),_display_(/*12.16*/message),format.raw/*12.23*/(""" """),format.raw/*12.24*/("""- """),_display_(/*12.27*/name),format.raw/*12.31*/("""</h4>
        </div>
      </div>
    </div>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(message:String,name:String): play.twirl.api.HtmlFormat.Appendable = apply(message,name)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,name) => apply(message,name)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 12:59:20 GMT 2016
                  SOURCE: /home/wdd/webapps/lab2/app/views/index.scala.html
                  HASH: c7be6fe91135b8c56c665de50e89e41e408aff25
                  MATRIX: 752->1|878->32|905->34|925->46|964->48|995->53|1190->221|1218->228|1247->229|1277->232|1302->236|1378->282
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|43->12|43->12|43->12|43->12|43->12|47->16
                  -- GENERATED --
              */
          
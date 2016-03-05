package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import com.greencatsoft.angularjs.Angular

object TutorialApp extends JSApp {
  def main(): Unit = {

    val module = Angular.module("routerApp", Seq("ui.router"))
    module.config[RouterConfig]
      .controller[RouterController]
      .controller[State1Controller]

    //    jQuery(setupUI _)
  }

  //  def setupUI(): Unit = {
  //    jQuery("""<button type="button">Click me!</button>""")
  //      .click(addClickedMessage _)
  //      .appendTo(jQuery("body"))
  //    jQuery("body").append("<p>Hello World</p>")
  //  }
  //
  //  def addClickedMessage(): Unit = {
  //    jQuery("body").append("<p>You clicked the button!</p>")
  //  }
}

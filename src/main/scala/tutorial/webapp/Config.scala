package tutorial.webapp

import scala.scalajs.js
import com.greencatsoft.angularjs.Config
import com.greencatsoft.angularjs.extensions.State
import com.greencatsoft.angularjs.extensions.StateProvider
import com.greencatsoft.angularjs.extensions.UrlRouterProvider
import com.greencatsoft.angularjs.extensions.View
import scala.scalajs.js.annotation.ScalaJSDefined

class RouterConfig(stateProvider: StateProvider, urlRouterProvider: UrlRouterProvider) extends Config{
  urlRouterProvider.otherwise("/home")
  
  stateProvider
    .state("home", State(url="/home", templateUrl="html/partial-home.html"))
    .state("home.list", State(url="/list", views=Map("" -> View("html/partial-home-list.html", "state1Ctrl"))))
    .state("home.paragraph", MyStateWithTemplate(url="/paragraph", template="I could sure use a drink right now."))
    .state("about", State(url="/about", 
        views=Map("" -> View("html/partial-about.html", ""), 
                  "columnOne@about" -> View("html/table-data.html", "routerCtrl"))))
}

object MySateWithController{
  def apply(url: String, isAbstract: Boolean = false, templateUrl: String = "", controller: js.Any, views: Map[String, View] = Map.empty): State = {
    val out = State(url, isAbstract, templateUrl, views)
    out.controller = controller
    out
  }
}
  
object MyStateWithTemplate{
  def apply(url: String, isAbstract: Boolean = false, templateUrl: String = "", template: String, views: Map[String, View] = Map.empty): State = {
    val out = State(url, isAbstract, templateUrl, views)
    out.template = template
    out
  }
}

@ScalaJSDefined
trait ListCtrl extends js.Object{
  
}
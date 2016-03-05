package tutorial.webapp

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

import com.greencatsoft.angularjs.AbstractController
import com.greencatsoft.angularjs.core.Scope
import com.greencatsoft.angularjs.injectable

@injectable("routerCtrl")
class RouterController(myScope: MyScope) extends AbstractController[MyScope](myScope) {
  scope.message = "test"
  scope.scotches = js.Array(
    Scotch("Macallan 12", 50),
    Scotch("Chivas Regal Royal Salute", 10000),
    Scotch("Glenfiddich 1937", 20000))
}

@js.native
trait MyScope extends Scope {
  var message: String
  var scotches: js.Array[Scotch]
}

@ScalaJSDefined
class Scotch(val name: String, val price: Int) extends js.Object

object Scotch {
  def apply(name: String, price: Int) = new Scotch(name, price)
}

@injectable("state1Ctrl")
class State1Controller(scope: State1Scope) extends AbstractController[State1Scope](scope) {
  scope.dogs = js.Array("Bernese", "Husky", "Goldendoodle")
}

@js.native
trait State1Scope extends Scope {
  var dogs: js.Array[String]
}
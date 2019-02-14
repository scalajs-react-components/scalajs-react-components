package chandu0101.scalajs.react.components.semanticui

import chandu0101.macros.tojs.JSMacro

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom._

import scala.scalajs.js
import scala.scalajs.js.|

case class ButtonAnimatedType private (value: String) extends AnyVal
object ButtonAnimatedType {
  val fade     = ButtonAnimatedType("fade")
  val vertical = ButtonAnimatedType("vertical")
  val values   = List(fade, vertical)
}

case class PointingDirection private (value: String) extends AnyVal
object PointingDirection {
  val left = PointingDirection("left")
  val right = PointingDirection("right")
  val top = PointingDirection("top")
  val top_left = PointingDirection("top left")
  val top_right = PointingDirection("top right")
  val bottom = PointingDirection("bottom")
  val bottom_left = PointingDirection("bottom left")
  val bottom_right = PointingDirection("bottom right")
}

case class SuiIconType(value: String) extends AnyVal

case class SuiCountry(value: String) extends AnyVal

@js.native
trait SuiRateObject extends js.Object {
  def rating: Int = js.native
  def maxRating: Int = js.native
}

@js.native
trait PaginationEventData extends js.Object {
  def activePage: Int = js.native
}

@js.native
trait SuiDropDownOption extends js.Object {
  def key: String = js.native
  def text: String = js.native
  def value: String = js.native
}

@js.native
trait SuiChangeObject extends js.Object {
  def value: js.UndefOr[String | js.Array[String]]   = js.native
}

@js.native
trait SuiSearchChangeObject extends js.Object {
  def value: js.UndefOr[String | js.Array[String]]   = js.native
  /** A selection dropdown can allow a user to search through a large list of choices.
     Pass a function here to replace the default search. */
  def search:               js.UndefOr[Boolean | (ReactEvent => Callback)]                                  = js.native
  /** A shorthand for a search input. */
  def searchInput:          js.UndefOr[js.Array[js.Object] | VdomNode | js.Object | React.Node | js.Object] = js.native
  /** Current value of searchQuery. Creates a controlled component. */
  def searchQuery:          js.UndefOr[String]                                                              = js.native
}

@js.native
trait SuiCheckboxChangeObject extends js.Object {
  def checked: Boolean = js.native
}

object SuiDropDownOption {
  def apply(key: String, text: String, value: String): SuiDropDownOption = {
    js.Dynamic.literal(key = key, text = text, value = value).asInstanceOf[SuiDropDownOption]
  }
  def apply(str: String): SuiDropDownOption = {
    js.Dynamic.literal(key = str, text = str, value = str).asInstanceOf[SuiDropDownOption]
  }
}

class SuiHorizontallyOrVertically(val value: String) extends AnyVal
object SuiHorizontallyOrVertically {
  val horizontally = new SuiHorizontallyOrVertically("horizontally")
  val vertically = new SuiHorizontallyOrVertically("vertically")
  val values = List(horizontally, vertically)
}

class SuiFormFieldControlType(val value: String) extends AnyVal
object SuiFormFieldControlType {
  val button = new SuiFormFieldControlType("button")
  val input = new SuiFormFieldControlType("input")
  val select = new SuiFormFieldControlType("select")
  val textarea = new SuiFormFieldControlType("textarea")
  val values = List(button, input, select, textarea)
}

class SuiModalDimmer(val value: String) extends AnyVal
object SuiModalDimmer {
  val inverted = new SuiModalDimmer("inverted")
  val blurring = new SuiModalDimmer("blurring")
  val values = List(inverted, blurring)
}

class SuiFourDirections(val value: String) extends AnyVal
object SuiFourDirections {
  val left = new SuiFourDirections("left")
  val right = new SuiFourDirections("right")
  val bottom = new SuiFourDirections("bottom")
  val top = new SuiFourDirections("top")
  val values = List(left, right, bottom, top)
}

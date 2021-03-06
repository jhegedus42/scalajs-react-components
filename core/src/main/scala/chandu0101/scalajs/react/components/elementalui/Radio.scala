package chandu0101.scalajs.react.components
package elementalui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`

case class Radio(
    name: js.UndefOr[String] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inline: js.UndefOr[Boolean] = js.undefined,
    label: js.UndefOr[String] = js.undefined) {
  def apply() = {
    val props = JSMacro[Radio](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Eui.Radio)
    f(props).asInstanceOf[ReactComponentU_]
  }
}

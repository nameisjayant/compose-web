package practise

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun counterApp() {
    var counter by mutableStateOf(0)
    Div(
        attrs = {
            style {
                justifyItems("center")
                alignItems(AlignItems.Center)
            }
        }
    ) {
        Span(
            attrs = {
                style {
                    fontSize(30.px)
                    fontStyle("bold")
                }
            }
        ) {
            Text("$counter")
        }

        Br()
        Button(
            attrs = {
                onClick { counter++ }
                style {
//                    width(100.px)
//                    height(50.px)
                    background("transparent")
                    padding(10.px)
                    borderRadius(10.px)
                    // borderWidth(5.px)
                    border(2.px, style = LineStyle.Dotted, color = Color.black)

                }
            }
        ) {
            Text("Counter")
        }
    }


}
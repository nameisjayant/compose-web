import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import kotlin.coroutines.CoroutineContext

fun main() {

    renderComposable(rootElementId = "root") {
        counterApp()
    }
}

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
        Text("$counter")
        Br()
        Button(
            attrs = {
                onClick { counter++ }
                style {
//                    width(100.px)
//                    height(50.px)
                    background("red")
                    padding(10.px)
                }
            }
        ) {
            Text("Counter")
        }
    }


}

@Composable
fun demo() {
    var count by mutableStateOf(0)

    Div({ style { padding(25.px) } }) {
        Button(attrs = {
            onClick { count -= 1 }
        }) {
            Text("-")
        }

        Span({ style { padding(15.px) } }) {
            Text("$count")
        }

        Button(attrs = {
            onClick { count += 1 }
            style {
                color(Color.rebeccapurple)
            }
        }) {
            Text("+")
        }

        Div(
            attrs = {
                style {
                    styleForText()
                }

            }
        ) {
            Text("Hello Compose web")
        }

    }
}

object MyStyleSheet : StyleSheet() {
    val container by style {
        border(width = 3.px, style = LineStyle.Dashed, color = Color.rebeccapurple)
    }
}

fun StyleScope.styleForText() {
    color(Color.rebeccapurple)
    border(width = 3.px, style = LineStyle.Dashed, color = Color.rebeccapurple)
}
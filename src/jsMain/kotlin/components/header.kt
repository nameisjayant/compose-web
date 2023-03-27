package components

import androidx.compose.runtime.Composable
import css.MyStyleSheet
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.hreflang
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun header() {
    Div(
        attrs = {
            style {
                background("black")
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    padding(20.px)
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.End)
                }

            }
        ) {
            appText("Home","http://localhost:8080/home")
            appText("Images","http://localhost:8080/images")
            appText("About Us","http://localhost:8080/aboutus")
        }
    }
}

@Composable
fun appText(
    text: String,
    url:String
) {
    A(
        attrs = {
            href(url)
            target(ATarget.Blank)
            hreflang("en")
            classes(MyStyleSheet.header_text)
        }
    ) {
        Text(text)
    }

}
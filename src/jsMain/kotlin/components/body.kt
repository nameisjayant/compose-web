package components

import androidx.compose.runtime.Composable
import css.MyStyleSheet
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.CSSAutoKeyword
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*


@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun body() {

    Tbody(
        attrs = {
            style {
                position(Position.Relative)
                textAlign("center")
            }
        }
    ) {
        Img("/image.jpeg", alt = "image") {
            classes(MyStyleSheet.body_image)
        }
        Button(
            attrs = {
                classes(MyStyleSheet.buttonStyle)
            }
        ) {
            Text("Get Started")
        }
    }

}
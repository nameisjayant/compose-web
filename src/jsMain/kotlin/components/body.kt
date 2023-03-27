package components

import androidx.compose.runtime.Composable
import css.MyStyleSheet
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text


@Composable
fun body() {

    Div {
        Img("/image.jpeg", alt = "image") {
            classes(MyStyleSheet.body_image)
        }
    }

}
import androidx.compose.runtime.*
import components.body
import components.footer
import components.header
import css.MyStyleSheet
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {

    renderComposable(rootElementId = "root") {
        Style(MyStyleSheet)
        header()
        body()
        footer()
    }
}








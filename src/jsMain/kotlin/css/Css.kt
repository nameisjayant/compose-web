package css

import org.jetbrains.compose.web.css.*

object MyStyleSheet : StyleSheet() {

    init {
        "*" style {
            padding(0.px)
            margin(0.px)
        }
    }

    val header_text by style {
        color(Color.white)
        fontSize(20.px)
        textDecoration("none")
        paddingRight(10.px)
        property("font-family", "Arial, Helvetica, sans-serif")
        hover(self) style {
            color(Color.cyan)
            textDecoration("underline")
            textDecorationColor(Color.cyan)
        }
    }

}
package css

import org.jetbrains.compose.web.css.*

object MyStyleSheet : StyleSheet() {

    init {
        "*" style {
            padding(0.px)
            margin(0.px)
            boxSizing("borderBox")
            property("font-family", "Arial, Helvetica, sans-serif")

        }
    }

    val header_text by style {
        color(Color.white)
        fontSize(20.px)
        textDecoration("none")
        paddingRight(10.px)
        hover(self) style {
            color(Color.cyan)
            textDecoration("underline")
            textDecorationColor(Color.cyan)
        }
    }

    val body_image by style {
        maxWidth("100%")
        maxHeight("auto")
    }

    val footer_container by style {
        display(DisplayStyle.Block)
        background("black")
    }

    val footer_hover by style {
        paddingRight(15.px)
        color(Color.white)
        textDecoration("none")
        hover(self) style {
            textDecoration("underline")
            textDecorationColor(Color.cyan)
        }
    }

    val buttonStyle by style {
        position(Position.Absolute)
        property("top", "50%")
        property("left", "50%")
        padding(10.px)
        fontSize(40.px)
        borderWidth(0.px)
        borderRadius(10.px)
        background("white")
        hover(self) style{
            background("cyan")
        }
    }

}
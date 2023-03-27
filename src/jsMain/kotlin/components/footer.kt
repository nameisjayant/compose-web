package components

import androidx.compose.runtime.Composable
import css.MyStyleSheet
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.url.URL

@Composable
fun footer() {
    Div(attrs = {
        classes(MyStyleSheet.footer_container)
    }) {
        Div(
            attrs = {
                style {
                    padding(30.px)
                    display(DisplayStyle.Block)
                }
            }
        ) {
            H2(
                attrs = {
                    style {
                        color(Color.white)
                    }
                }
            ) {
                Text("Social Links")
            }
            Div(
                attrs = {
                    style {
                        display(DisplayStyle.Block)
                    }
                }
            ) {
                footerLinks("Instagram","")
                footerLinks("Github","")
                footerLinks("Youtube","")
            }
        }
    }
}

@Composable
fun footerLinks(
    text:String,
    url: String
){
    A(
        attrs = {
            style {
                paddingTop(15.px)
                color(Color.white)
                textDecoration("none")
            }
        }
    ){
        Text(text)
    }
}
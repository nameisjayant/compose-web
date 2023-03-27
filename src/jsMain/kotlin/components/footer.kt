package components

import androidx.compose.runtime.Composable
import css.MyStyleSheet
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
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
                        paddingTop(15.px)
                    }
                }
            ) {
                footerLinks("Instagram","https://www.instagram.com/programming_simplified")
                footerLinks("Github","https://www.github.com/nameisjayant")
                footerLinks("Youtube","https://www.youtube.com/programmingsimplified0")
            }

            Div(
                attrs = {
                    style {
                        paddingTop(15.px)
                        display(DisplayStyle.Flex)
                        justifyContent(JustifyContent.Center)
                    }
                }
            ) {
                H3(
                    attrs = {
                        style {
                            color(Color.white)
                        }
                    }
                ) {
                    Text("Made with Compose ❤️")
                }
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
            href(url)
            target(ATarget.Blank)
            classes(MyStyleSheet.footer_hover)
        }
    ){
        Text(text)
    }
}
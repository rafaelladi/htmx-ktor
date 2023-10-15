package htmx

import kotlinx.html.HTMLTag

fun HTMLTag.hxPost(value: String) {
    attributes["hx-post"] = value
}
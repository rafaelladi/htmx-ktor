package htmx

import kotlinx.html.HTMLTag

fun HTMLTag.hxGet(value: String) {
    attributes["hx-get"] = value
}
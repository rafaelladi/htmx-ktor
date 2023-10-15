package htmx

import kotlinx.html.HTMLTag

fun HTMLTag.hxDelete(value: String) {
    attributes["hx-delete"] = value
}
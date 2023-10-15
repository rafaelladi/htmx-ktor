package htmx

import kotlinx.html.HTMLTag

fun HTMLTag.hxPut(value: String) {
    attributes["hx-put"] = value
}
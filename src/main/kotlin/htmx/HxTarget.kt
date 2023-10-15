package htmx

import kotlinx.html.HTMLTag

fun HTMLTag.hxTarget(value: String) {
    attributes["hx-target"] = value
}
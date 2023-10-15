package htmx

import kotlinx.html.HTMLTag

fun HTMLTag.hxTrigger(value: String) {
    attributes["hx-trigger"] = value
}
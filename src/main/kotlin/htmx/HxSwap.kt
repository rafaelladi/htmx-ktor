package htmx

import kotlinx.html.HTMLTag

enum class HxSwap(val type: String) {
    INNER_HTML("innerHTML"),
    OUTER_HTML("outerHTML"),
    BEFORE_BEGIN("beforebegin"),
    BEFORE_END("beforeend")
}

fun HTMLTag.hxSwap(value: HxSwap) {
    attributes["hx-swap"] = value.type
}
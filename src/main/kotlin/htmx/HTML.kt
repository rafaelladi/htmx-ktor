package htmx

import io.ktor.server.application.*
import io.ktor.server.response.*
import kotlinx.html.TagConsumer
import kotlinx.html.stream.appendHTML

suspend inline fun ApplicationCall.respondHtmlFragment(crossinline block: TagConsumer<StringBuilder>.() -> Unit) = respondText {
    buildString { appendHTML().apply(block) }
}

suspend inline fun ApplicationCall.respondEmptyHtml() = respondHtmlFragment {}
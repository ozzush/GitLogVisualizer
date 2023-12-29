package com.example.plugins

import com.example.git.decodeFromJsonArray
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.html.*
import kotlinx.html.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val owner = call.request.queryParameters["owner"]
            val repo = call.request.queryParameters["repo"]
            if (owner == null || repo == null) {
                call.respondText("Required parameters missing: owner, repo")
            } else {
                val client = HttpClient(CIO)
                val response: HttpResponse = client.get("https://api.github.com/repos/$owner/$repo/commits")
                client.close()
                val githubCommits = decodeFromJsonArray(response.bodyAsText())
                call.respondHtml(HttpStatusCode.OK) {
                    head {
                        title {
                            +"Commit history for $owner/$repo"
                        }
                    }
                    body {
                        githubCommits.forEach {
                            unsafe {
                                +it.toHtmlString()
                            }
                            +"============================================";br
                        }
                    }
                }
//                call.respondH(githubCommits.joinToString("\n=====================================\n"))
            }
        }
    }
}

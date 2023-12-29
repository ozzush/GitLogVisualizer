package com.example.git

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.*

@Serializable
data class Author(
    val name: String,
    val email: String,
    val date: String
) {
    override fun toString(): String {
        return "$name ($email) on $date"
    }
}

@Serializable
data class Commit(
    val author: Author,
    val message: String,
    val url: String,
)

@Serializable
data class Parent(
    val sha: String,
    val url: String,
)

data class GithubCommit(val sha: String, val commit: Commit, val parents: List<Parent>) {
    fun toHtmlString(): String {
        return """
        <a href="${commit.url}">$sha</a><br>
        <b>Author:</b> ${commit.author}<br>
        <b>Commit message:</b><br>
        ${commit.message.prependIndent("        ").trimStart().replace("\n", "<br>")}<br>
        <br>
        <b>Parents:</b><br>
        ${parents.joinToString("<br>") { parent -> "<a href=\"${parent.url}\">${parent.sha}</a>" }}<br>
        """.trimIndent()
    }
}

fun decodeFromJsonArray(jsonString: String): List<GithubCommit> {
    val json = Json {
        ignoreUnknownKeys = true
    }
    return json.parseToJsonElement(jsonString).jsonArray.map { element ->
        val jsonMap = element.jsonObject.toMap()
        val sha = jsonMap["sha"]!!.jsonPrimitive.content
        val commit = jsonMap["commit"]!!.jsonObject.let { json.decodeFromJsonElement<Commit>(it) }
        val parents = jsonMap["parents"]!!.jsonArray.map { json.decodeFromJsonElement<Parent>(it) }
        GithubCommit(sha, commit, parents)
    }
}

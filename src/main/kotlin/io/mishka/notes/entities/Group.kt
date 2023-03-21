package io.mishka.notes.entities

import io.mishka.notes.entities.images.groupsImages
import kotlin.math.abs
import kotlin.random.Random

enum class GroupTheme {
    FASHION,
    SPORT,
    NEWS
}

data class Group(
        var id: String = "",
        var imgUrl: String = "",
        val groupName: String,
        val city: String,
        val theme: String = GroupTheme.values()[abs(Random.nextInt()) % GroupTheme.values().size].toString(),
        val followers: String = "${abs(Random.nextInt()) % 1000}"
)

val groups = listOf(
        Group(groupName = "Celebrating R. Kelly", city = "London"),
        Group(groupName = "Cash Frenzy Online", city = "Moscow"),
        Group(groupName = "ZUMBA DANCE", city = "Limassol"),
        Group(groupName = "Hawaii Vacation Planning - Plan a Trip to Hawaii", city = "Hawai"),
        Group(groupName = "Destination Japan", city = "Tokyo"),
        Group(groupName = "Sacramento Wedding Planning", city = "Paris"),
        Group(groupName = "PLANOS, IDEAS Y DISEÑOS PARA CONSTRUIR, REMODELAR MI CASA", city = "Rome"),
        Group(groupName = "Decor Home Ideas", city = "Perm"),
        Group(groupName = "Linux Fans Group", city = "New York"),
        Group(groupName = "The Meow Universe", city = "Sidney"),
        Group(groupName = "Nature Heaven Group", city = "Cairo"),
        Group(groupName = "Pokemon GO Bay Area", city = "Beijing"),
        Group(groupName = "Sacramento Real Estate", city = "Los Angles"),
        Group(groupName = "TANGO EVENTS & INFO FOR THE SAN FRANCISCO BAY AREA", city = "Saint-Petersburg"),
        Group(groupName = "Gardening Ideas & More", city = "Bangkok"),
).apply {
    forEachIndexed { index, group ->
        group.id = "${index + 1}"
        group.imgUrl = groupsImages[index]
    }
}
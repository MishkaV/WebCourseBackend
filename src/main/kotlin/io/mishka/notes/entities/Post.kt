package io.mishka.notes.entities

import io.mishka.notes.entities.images.postImageUrls
import io.mishka.notes.entities.images.postSimilarImageUrls
import io.mishka.notes.entities.images.userAvatarUrls


data class Post(
        var userUrl: String = "",
        val fullName: String,
        val date: String,
        var imgUrl: String = "",
        var similarImgUrl: String = "",
        var id: String = "",
)

val posts = listOf(
        Post(fullName = "John Doe", date = "March 20"),
        Post(fullName = "Mary Smith", date = "March 11"),
        Post(fullName = "Bob Johnson", date = "December 20"),
        Post(fullName = "Emma Wilson", date = "May 30"),
        Post(fullName = "David Lee", date = "June 12"),
        Post(fullName = "Alex Jones", date = "August 29"),
        Post(fullName = "Sarah Garcia", date = "March 11"),
        Post(fullName = "Mike Brown", date = "September 9"),
        Post(fullName = "Isabella Lopez", date = "April 1"),
        Post(fullName = "Kevin Nguyen", date = "March 18"),
).apply {
    forEachIndexed {
        index, post ->
        post.id = "${index + 1}"
        post.imgUrl = postImageUrls[index]
        post.similarImgUrl = postSimilarImageUrls[index]
        post.userUrl = userAvatarUrls[index]
    }
}
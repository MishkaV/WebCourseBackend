package io.mishka.notes.controller

import io.mishka.notes.entities.*
import io.mishka.notes.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class NotesController(val service: MessageService) {

    /**
     * Users
     */
    @GetMapping("/users")
    fun getFriends(): List<User> {
        return users
    }

    /**
     * News
     */
    @GetMapping("/news")
    fun getNews(): List<News> {
        return newsList
    }

    /**
     * Messages
     */
    @GetMapping("/messages")
    fun getMessages(): List<Messages> {
        return messages
    }

    /**
     * Posts
     */
    @GetMapping("/posts")
    fun getPosts(): List<Post> {
        return posts
    }
}
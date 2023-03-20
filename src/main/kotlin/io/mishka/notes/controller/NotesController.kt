package io.mishka.notes.controller

import io.mishka.notes.entities.Friend
import io.mishka.notes.entities.News
import io.mishka.notes.entities.friends
import io.mishka.notes.entities.newsList
import io.mishka.notes.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class NotesController(val service: MessageService) {

    /**
     * Friends
     */
    @GetMapping("/friends")
    fun getFriends(): List<Friend> {
        return service.getFriends()
    }

    @GetMapping("/generate-friends")
    fun generateFriends(): List<Friend> {
        friends.forEach { service.saveFriend(it) }
        return service.getFriends()
    }

    /**
     * News
     */
    @GetMapping("/news")
    fun getNews(): List<News> {
        return newsList
    }

    @GetMapping("/generate-news")
    fun generateNews(): List<News> {
        newsList.forEach { service.saveNews(it) }
        return service.getNews()
    }
}
package io.mishka.notes.controller

import io.mishka.notes.entities.Friend
import io.mishka.notes.entities.friends
import io.mishka.notes.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class NotesController(val service: MessageService) {

    @GetMapping("/friends")
    fun getFriends(): List<Friend> {
        return service.getFriends()
    }
    @GetMapping("/generate-friends")
    fun generateFriends(): List<Friend> {
        friends.forEach { service.saveFriend(it) }
        return service.getFriends()
    }
}
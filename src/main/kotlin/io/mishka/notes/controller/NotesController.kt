package io.mishka.notes.controller

import io.mishka.notes.entities.Friend
import io.mishka.notes.entities.friends
import io.mishka.notes.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class NotesController(val service: MessageService) {

    init {
        friends.forEach { service.saveFriend(it) }
    }

    @GetMapping("/friends")
    fun about(): List<Friend> {
        return service.getFriends()
    }

}
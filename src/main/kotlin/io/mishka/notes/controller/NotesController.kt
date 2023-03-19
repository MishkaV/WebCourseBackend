package io.mishka.notes.controller

import io.mishka.notes.entities.Friend
import io.mishka.notes.entities.friends
import org.springframework.web.bind.annotation.*

@RestController
class NotesController {

    @GetMapping("/friends")
    fun about(): List<Friend> {
        return friends
    }

}
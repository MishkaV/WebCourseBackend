package io.mishka.notes.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NotesController {

    @GetMapping("/about")
    fun about(): String {
        return "COOL NOTES ABOUT"
    }
}
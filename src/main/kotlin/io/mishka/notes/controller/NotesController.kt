package io.mishka.notes.controller

import io.mishka.notes.entities.Note
import org.springframework.web.bind.annotation.*

@RestController
class NotesController {

    private val notes: MutableList<Note> = mutableListOf()

    @GetMapping("/about")
    fun about(): String {
        return "COOL NOTES ABOUT"
    }

    @GetMapping("/notes")
    fun getAllNotes(): List<Note> {
        return notes
    }

    @PostMapping("/new-note")
    fun setNewNote(@RequestBody note: Note) {
        notes.add(note)
    }
}
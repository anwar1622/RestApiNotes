package com.example.restapimynotes.controller;

import com.example.restapimynotes.model.Notes;
import com.example.restapimynotes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NotesController {
    @Autowired
    NotesService notesService;

    @GetMapping("/v1/notes/all")
    public List<Notes> listAllNotes() {
        return notesService.listAllNotes();
    }
    @PostMapping(value = "/v1/notes", consumes = {"application/xml", "application/json"} )
    public void add(@RequestBody Notes notes) {
        notesService.saveNotes(notes);
    }
}

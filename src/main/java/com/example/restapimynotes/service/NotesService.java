package com.example.restapimynotes.service;

import com.example.restapimynotes.model.Notes;
import com.example.restapimynotes.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NotesService {
    @Autowired
    private NotesRepository notesRepository;
    public List<Notes> listAllNotes() {
        return notesRepository.findAll();
    }
    public void saveNotes(Notes notes) {
        notesRepository.save(notes);
    }
    public Notes getNotesById(Integer id) {
        return notesRepository.findById(id).get();
    }
    public void deleteNotes(Integer id) {
        notesRepository.deleteById(id);
    }
}

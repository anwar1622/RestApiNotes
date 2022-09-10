package com.example.restapimynotes.repository;

import com.example.restapimynotes.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Integer> {
}

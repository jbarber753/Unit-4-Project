package com.devmountaint.noteApp.repositories;

import com.devmountaint.noteApp.entities.Note;
import com.devmountaint.noteApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByUserEquals(User user);
}

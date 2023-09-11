package com.devmountaint.noteApp.entities;

import com.devmountaint.noteApp.dtos.NoteDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String body;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Note(Long id, String body) {
        this.id = id;
        this.body = body;
    }

    public Note() {
    }

    @ManyToOne
    @JsonBackReference
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Note(NoteDto noteDto){
        if (noteDto.getBody() != null){
            this.body = noteDto.getBody();
        }
    }
}

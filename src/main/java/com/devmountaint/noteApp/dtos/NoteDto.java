package com.devmountaint.noteApp.dtos;

import com.devmountaint.noteApp.entities.Note;
import com.devmountaint.noteApp.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto implements Serializable {
    private Long id;

    private String body;

    private UserDto userDto;

    public NoteDto(Note note){
        if (note.getId() != null){
            this.id = note.getId();
        }
        if (note.getBody() != null){
            this.body = note.getBody();
        }
    }
}

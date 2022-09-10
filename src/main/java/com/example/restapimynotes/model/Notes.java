package com.example.restapimynotes.model;

import javax.persistence.*;

@Entity
@Table(name = "notes")
public class Notes {
    private int id;
    private String title;

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public Notes() {

    }
    public Notes(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
}

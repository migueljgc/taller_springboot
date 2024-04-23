package com.example.Talller1.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table

public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<Users>users;


    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;
    }

    public void setId(long l) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

package com.example.Talller1.persistence.entity;

import jakarta.persistence.*;

@Entity
public class Personas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name, email;
    private String dni;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Personas() {
    }

    public Personas(String dni, String email, String name) {
        this.dni = dni;
        this.email = email;
        this.name = name;
    }

    @OneToOne(mappedBy = "persona_uuid", cascade = CascadeType.ALL)
    private Users users;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}

package com.example.Talller1.persistence.entity;

import com.example.Talller1.domain.dto.UsersDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Users extends UsersDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String pwd;

    @OneToOne()
    @JoinColumn(name = "persona_uuid")
    private Personas persona_uuid;

    @ManyToMany
    @JoinTable(
            name = "Roles.Users", joinColumns = @JoinColumn(name = "User_uuid"),
            inverseJoinColumns = @JoinColumn(name = "Roles_uuid")
    )
    private List<Roles>roles;

    public Users() {
    }

    public Personas getPersona_uuid() {
        return persona_uuid;
    }

    public void setPersona_uuid(Personas persona_uuid) {
        this.persona_uuid = persona_uuid;
    }


    public Users(String username, String pwd, Personas persona_uuid) {
        this.username = username;
        this.pwd = pwd;
        this.persona_uuid = persona_uuid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}

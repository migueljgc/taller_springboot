package com.example.Talller1.domain.dto;

import com.example.Talller1.persistence.entity.Personas;
import com.example.Talller1.persistence.entity.Roles;

import java.util.List;

public class UsersDTO {

    private String username;
    private String pwd;
    private PersonasDTO persona_uuid;
    private List<Roles> roles;

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

    public void setPersona_uuid(Personas personaUuid) {
    }
}
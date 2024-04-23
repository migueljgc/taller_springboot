package com.example.Talller1.persistence.entity;

import jakarta.persistence.*;

@Entity
public class UsersRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public UsersRoles() {
    }

    @ManyToOne
    @JoinColumn(name = "User_uuid")
    private Users User_uuid;

    @ManyToOne
    @JoinColumn(name = "Roles_uuid")
    private Roles Roles_uuid;




    public Roles getRoles_uuid() {
        return Roles_uuid;
    }

    public void setRoles_uuid(Roles roles_uuid) {
        Roles_uuid = roles_uuid;
    }

    public Users getUser_uuid() {
        return User_uuid;
    }

    public void setUser_uuid(Users user_uuid) {
        User_uuid = user_uuid;
    }






}

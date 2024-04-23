package com.example.Talller1.domain.dto;

import com.example.Talller1.persistence.entity.Roles;
import com.example.Talller1.persistence.entity.Users;

public class UsersRolesDTO {
    private UsersDTO User_uuid;
    private RolesDTO Roles_uuid;

    public RolesDTO getRoles_uuid() {
        return Roles_uuid;
    }

    public UsersDTO getUser_uuid() {
        return User_uuid;
    }

    public void setUser_uuid(UsersDTO user_uuid) {
        User_uuid = user_uuid;
    }

    public void setRoles_uuid(RolesDTO roles_uuid) {
        Roles_uuid = roles_uuid;
    }


    public void setRoles_uuid(Roles rolesUuid) {
    }
}

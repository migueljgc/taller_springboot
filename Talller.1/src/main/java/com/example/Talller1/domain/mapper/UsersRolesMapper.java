package com.example.Talller1.domain.mapper;

import com.example.Talller1.domain.dto.UsersRolesDTO;
import com.example.Talller1.persistence.entity.UsersRoles;

import java.util.Random;

public class UsersRolesMapper {

   public static UsersRoles toEntinty(UsersRolesDTO usersRolesDTO){
       UsersRoles usersRoles = new UsersRoles();
       usersRoles.setUser_uuid(usersRoles.getUser_uuid());
       usersRoles.setRoles_uuid(usersRoles.getRoles_uuid());
        return usersRoles;
   }

    public static UsersRolesDTO toDto(UsersRoles usersRoles){
        UsersRolesDTO usersRolesDTO = new UsersRolesDTO();
        usersRolesDTO.setUser_uuid(usersRoles.getUser_uuid());
        usersRolesDTO.setRoles_uuid(usersRoles.getRoles_uuid());
        return usersRolesDTO;
    }
}

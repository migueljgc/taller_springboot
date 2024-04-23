package com.example.Talller1.domain.mapper;

import com.example.Talller1.domain.dto.RolesDTO;
import com.example.Talller1.persistence.entity.Roles;

import java.util.Random;

public class RolesMapper {

   public static Roles toEntinty(RolesDTO rolesDTO){
        Roles roles = new Roles();
        roles.setName(roles.getName());
        roles.setId(new Random().nextLong());
        return roles;
   }

    public static RolesDTO toDto(Roles roles){
        RolesDTO rolesDTO = new RolesDTO();
        rolesDTO.setName(roles.getName());
        return rolesDTO;
    }
}

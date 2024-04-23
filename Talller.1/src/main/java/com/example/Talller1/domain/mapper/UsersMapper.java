package com.example.Talller1.domain.mapper;

import com.example.Talller1.domain.dto.UsersDTO;
import com.example.Talller1.persistence.entity.Users;

import java.util.Random;

public class UsersMapper {

   public static Users toEntinty(UsersDTO usersDTO){
       Users users = new Users();
       users.setPwd(users.getPwd());
       users.setUsername(users.getUsername());
       users.setPersona_uuid(users.getPersona_uuid());
       users.setId(new Random().nextLong());
        return users;
   }

    public static UsersDTO toDto(Users users){
        UsersDTO usersDTO = new UsersDTO();
        usersDTO.setPwd(users.getPwd());
        usersDTO.setUsername(users.getUsername());
        usersDTO.setPersona_uuid(users.getPersona_uuid());
        return usersDTO;
    }
}

package com.example.Talller1.api.controller;

import com.example.Talller1.domain.common.UsersRolesRoute;
import com.example.Talller1.domain.dto.UsersRolesDTO;
import com.example.Talller1.domain.service.UsersRolesService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = UsersRolesRoute.API)
public class UsersRolesController {
    @Autowired
    private UsersRolesService usersRolesService;

    @PostMapping(value = UsersRolesRoute.SAVE_USERS)
    public UsersRolesDTO save(@RequestBody UsersRolesDTO usersRolesDTO){
       return usersRolesService.save(usersRolesDTO);
    }



    @GetMapping(value = UsersRolesRoute.SAVE_USERS)
    public List<UsersRolesDTO> get(){
        return usersRolesService.getAll();
    }
}

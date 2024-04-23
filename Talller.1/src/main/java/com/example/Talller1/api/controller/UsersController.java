package com.example.Talller1.api.controller;

import com.example.Talller1.domain.common.UsersRoute;
import com.example.Talller1.domain.dto.UsersDTO;
import com.example.Talller1.domain.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = UsersRoute.API)
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping(value = UsersRoute.SAVE_USERS)
    public UsersDTO save(@RequestBody UsersDTO usersDTO){
       return usersService.save(usersDTO);
    }

    @GetMapping(value = UsersRoute.SAVE_USERS)
    public List<UsersDTO> get(){
        return usersService.getAll();
    }
}

package com.example.Talller1.api.controller;

import com.example.Talller1.domain.common.RolesRoute;
import com.example.Talller1.domain.dto.RolesDTO;
import com.example.Talller1.domain.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RolesRoute.API)
public class RolesController {
    @Autowired
    private RolesService rolesService;

    @PostMapping(value = RolesRoute.SAVE_ROLES)
    public RolesDTO save(@RequestBody RolesDTO rolesDTO){
       return rolesService.save(rolesDTO);
    }

    @GetMapping(value = RolesRoute.SAVE_ROLES)
    public List<RolesDTO> get(){
        return rolesService.getAll();
    }
}

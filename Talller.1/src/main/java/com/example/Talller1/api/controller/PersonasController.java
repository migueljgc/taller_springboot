package com.example.Talller1.api.controller;

import com.example.Talller1.domain.common.PersonasRoute;
import com.example.Talller1.domain.dto.PersonasDTO;
import com.example.Talller1.domain.service.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = PersonasRoute.API)
public class PersonasController {
    @Autowired
    private PersonasService personasService;

    @PostMapping(value = PersonasRoute.SAVE_PERSONAS)
    public PersonasDTO save(@RequestBody PersonasDTO personasDTO){
       return personasService.save(personasDTO);
    }

    @GetMapping(value = PersonasRoute.SAVE_PERSONAS)
    public List<PersonasDTO> get(){
        return personasService.getAll();
    }
}

package com.example.Talller1.domain.mapper;

import com.example.Talller1.domain.dto.PersonasDTO;
import com.example.Talller1.persistence.entity.Personas;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

public class PersonasMapper {

    public static Personas toEntinty(PersonasDTO personasDTO) {
        Personas personas = new Personas();
        personas.setDni(personasDTO.getDni());
        personas.setName(personasDTO.getName());
        personas.setEmail(personasDTO.getEmail());
        personas.setId(new Random().nextLong());
        return personas;
    }

    public static PersonasDTO toDto(Personas personas) {
        PersonasDTO personasDTO = new PersonasDTO();
        personasDTO.setDni(personas.getDni());
        personasDTO.setName(personas.getName());
        personasDTO.setEmail(personas.getEmail());
        return personasDTO;
    }

}

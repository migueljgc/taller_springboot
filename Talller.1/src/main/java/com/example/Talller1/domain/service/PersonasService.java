package com.example.Talller1.domain.service;

import com.example.Talller1.domain.dto.PersonasDTO;
import com.example.Talller1.domain.mapper.PersonasMapper;
import com.example.Talller1.persistence.repository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonasService {
    @Autowired
    private PersonasRepository personRepository;

    public PersonasDTO save(PersonasDTO personasDTO){
        personRepository.save(PersonasMapper.toEntinty(personasDTO));
        return personasDTO;
    }

    public List<PersonasDTO> getAll(){
       return personRepository.findAll().stream().map(PersonasMapper::toDto).collect(Collectors.toList());
    }
}

package com.example.Talller1.domain.service;

import com.example.Talller1.domain.dto.RolesDTO;
import com.example.Talller1.domain.mapper.RolesMapper;
import com.example.Talller1.persistence.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RolesService {
    @Autowired
    private RolesRepository rolesRepository;

    public RolesDTO save(RolesDTO rolesDTO){
        rolesRepository.save(RolesMapper.toEntinty(rolesDTO));
        return rolesDTO;
    }

    public List<RolesDTO> getAll(){
       return rolesRepository.findAll().stream().map(RolesMapper::toDto).collect(Collectors.toList());
    }
}

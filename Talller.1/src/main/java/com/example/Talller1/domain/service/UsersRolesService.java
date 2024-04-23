package com.example.Talller1.domain.service;

import com.example.Talller1.domain.dto.UsersRolesDTO;
import com.example.Talller1.domain.mapper.UsersRolesMapper;
import com.example.Talller1.persistence.repository.UsersRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersRolesService {
    @Autowired
    private UsersRolesRepository usersRolesRepository;

    public UsersRolesDTO save(UsersRolesDTO usersRolesDTO){
        usersRolesRepository.save(UsersRolesMapper.toEntinty(usersRolesDTO));
        return usersRolesDTO;
    }

    public List<UsersRolesDTO> getAll(){
       return usersRolesRepository.findAll().stream().map(UsersRolesMapper::toDto).collect(Collectors.toList());
    }
}

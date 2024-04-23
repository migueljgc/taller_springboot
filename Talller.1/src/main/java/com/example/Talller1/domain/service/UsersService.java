package com.example.Talller1.domain.service;

import com.example.Talller1.domain.dto.UsersDTO;
import com.example.Talller1.domain.mapper.UsersMapper;
import com.example.Talller1.persistence.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public UsersDTO save(UsersDTO usersDTO){
        usersRepository.save(UsersMapper.toEntinty(usersDTO));
        return usersDTO;
    }

    public List<UsersDTO> getAll(){
       return usersRepository.findAll().stream().map(UsersMapper::toDto).collect(Collectors.toList());
    }
}

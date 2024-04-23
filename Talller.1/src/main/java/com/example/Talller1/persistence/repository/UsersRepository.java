package com.example.Talller1.persistence.repository;

import com.example.Talller1.persistence.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}

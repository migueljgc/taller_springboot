package com.example.Talller1.persistence.repository;

import com.example.Talller1.persistence.entity.UsersRoles;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UsersRolesRepository extends JpaRepository<UsersRoles, Long> {

}

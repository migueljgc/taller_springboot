package com.example.Talller1.persistence.repository;

import com.example.Talller1.persistence.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}

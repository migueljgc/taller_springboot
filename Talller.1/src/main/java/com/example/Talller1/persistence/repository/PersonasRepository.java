package com.example.Talller1.persistence.repository;

import com.example.Talller1.persistence.entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PersonasRepository extends JpaRepository<Personas, Long> {

}

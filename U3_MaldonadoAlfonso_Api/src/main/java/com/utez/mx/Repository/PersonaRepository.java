package com.utez.mx.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utez.mx.Entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
	
}

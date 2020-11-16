package com.scalab.clinica.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scalab.clinica.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
	
}

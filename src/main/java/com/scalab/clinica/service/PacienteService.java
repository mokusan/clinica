package com.scalab.clinica.service;

import java.util.List;

import com.scalab.clinica.model.Paciente;

public interface PacienteService {

	List<Paciente> getAll();
	
	Paciente save(Paciente paciente);
}

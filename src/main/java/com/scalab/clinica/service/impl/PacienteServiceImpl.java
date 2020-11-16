package com.scalab.clinica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalab.clinica.model.Paciente;
import com.scalab.clinica.repo.PacienteRepository;
import com.scalab.clinica.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository repoInterface;
	
	@Override
	public List<Paciente> getAll() {
		return repoInterface.findAll();
	}

	@Override
	public Paciente save(Paciente paciente) {
		return repoInterface.save(paciente);
	}
	
	
	

}

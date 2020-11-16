package com.scalab.clinica.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scalab.clinica.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
	
}

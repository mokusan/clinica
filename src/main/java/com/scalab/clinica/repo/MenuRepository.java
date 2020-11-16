package com.scalab.clinica.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scalab.clinica.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
	
}

package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Bus;

@Repository
public interface IBusesRepository extends JpaRepository<Bus, Integer>{
	
}

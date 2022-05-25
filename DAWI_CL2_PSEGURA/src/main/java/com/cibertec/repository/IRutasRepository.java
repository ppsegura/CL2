package com.cibertec.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Ruta;

@Repository
public interface IRutasRepository extends JpaRepository<Ruta, Integer>{

}

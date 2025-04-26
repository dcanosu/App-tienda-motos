package com.upb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.upb.model.entities.Asignacion;
import java.util.List;


public interface AsignacionRepositorio extends Repository<Asignacion, Long>{

    List<Asignacion> findAll();

    @Query(value = "SELECT * FROM assignments ", nativeQuery = true)
    List<Asignacion> obtenerAsignacionesManual();
}

package com.upb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.upb.model.entities.Cliente;
import java.util.List;


public interface ClienteRepositorio extends Repository<Cliente, Long>{

    List<Cliente> findAll();

    @Query(value = "SELECT * FROM clientes ", nativeQuery = true)
    List<Cliente> obtenerTodosClientesManual();
}

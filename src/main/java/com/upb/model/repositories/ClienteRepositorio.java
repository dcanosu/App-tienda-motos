package com.upb.model.repositories;
public interface ClienteRepositorio {
    List<Cliente> findAll();

    @Query(value = "select  * from clientes",nativeQuery = true)
    List<Cliente> traerTodo();
}

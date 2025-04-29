package com.upb.model.repositories;
public interface MotoRepositorio {
    List<Moto> findAll();

    @Query(value = "select  * from motos",nativeQuery = true)
    List<Moto> traerTodo();
}

package com.upb.model.repositories;
import org.springframework.data.jpa.repository.Query;
import com.upb.model.entities.Cliente;
import java.util.List;

public interface ClienteRepositorio {
    List<Cliente> findAll();

    @Query(value = "select  * from clientes",nativeQuery = true)
    List<Cliente> traerTodo();
}

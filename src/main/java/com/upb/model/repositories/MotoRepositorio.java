package com.upb.model.repositories;
import org.springframework.data.jpa.repository.Query;
import com.upb.model.entities.Moto;
import java.util.List;

public interface MotoRepositorio {
    List<Moto> findAll();

    @Query(value = "select  * from motos",nativeQuery = true)
    List<Moto> traerTodo();
}

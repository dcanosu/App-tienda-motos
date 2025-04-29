package com.upb.model.entities;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "servicio_moto")
public class ServicioMoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long moto_id;
    Long servicio_id;
    Long cargo_id;
    Date fecha_servicio;
    String comentarios;
    @Column(name = "moto_id")
    Long fk_moto_id;
    @Column(name = "servicio_id")
    Long fk_servicio_id;
    @Column(name = "cargo_id")
    Long fk_cargo_id;
}

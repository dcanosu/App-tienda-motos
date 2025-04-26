package com.upb.model.entities;

import java.time.LocalDate;

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
@Table(name = "assignments")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long Id;
    @Column(name = "employee_id")
    Long fk_id_empleado;
    @Column(name = "project_id")
    Long fk_id_proyecto;
    @Column(name = "assigned_at")
    LocalDate asignado_en;
}

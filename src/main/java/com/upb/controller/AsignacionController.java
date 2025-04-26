package com.upb.controller;

import org.springframework.web.bind.annotation.RestController;

import com.upb.model.entities.Asignacion;
import com.upb.service.AsignacionServicio;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AsignacionController {

    private final AsignacionServicio asignacionServicio;

    public AsignacionController(AsignacionServicio asignacionServicio) {
        this.asignacionServicio = asignacionServicio;
    }

    @GetMapping("/obtenerTodo")
    public List<Asignacion> obtenerTodAsignacions() {
        return asignacionServicio.getTodasAsignaciones();
    }
    

    @GetMapping("/obtenerManual")
    public List<Asignacion> obtenerTodAsignacionsManual() {
        return asignacionServicio.getTodasAsignacionesManual();
    }

}

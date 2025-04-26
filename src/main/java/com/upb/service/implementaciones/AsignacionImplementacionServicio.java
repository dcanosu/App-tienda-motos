package com.upb.service.implementaciones;

import org.springframework.stereotype.Service;

import com.upb.model.entities.Asignacion;
import com.upb.model.repositories.AsignacionRepositorio;
import com.upb.service.AsignacionServicio;
import java.util.List;

@Service
public class AsignacionImplementacionServicio implements AsignacionServicio {

    private final AsignacionRepositorio asignacionRepositorio;

    public AsignacionImplementacionServicio(AsignacionRepositorio asignacionRepositorio) {
        this.asignacionRepositorio = asignacionRepositorio;
    }

    @Override
    public List<Asignacion> getTodasAsignaciones() {
        return asignacionRepositorio.findAll();
    }

    @Override
    public List<Asignacion> getTodasAsignacionesManual() {
        return asignacionRepositorio.obtenerAsignacionesManual();
}

}

package com.upb.service;

import java.util.List;

import com.upb.model.entities.Asignacion;

public interface AsignacionServicio {

    List<Asignacion>getTodasAsignaciones();

    List<Asignacion>getTodasAsignacionesManual();

}

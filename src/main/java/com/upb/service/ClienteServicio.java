package com.upb.service;

import java.util.List;

import com.upb.model.entities.Cliente;

public interface ClienteServicio {
    
    List<Cliente>getTodosClientes();

    List<Cliente>getTodosClientesManual();
}

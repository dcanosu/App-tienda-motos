package com.upb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upb.model.entities.Cliente;
import com.upb.service.ClienteServicio;

@RestController
public class ClienteContoller {

    private final ClienteServicio clienteServicio;

    public ClienteContoller(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    @GetMapping("/obtenerTodosClientes")
    public List<Cliente> obtenerTodosClientes() {
        return clienteServicio.getTodosClientes();
    }
    

    @GetMapping("/obtenerClienteManual")
    public List<Cliente> obtenerTodosClientesManual() {
        return clienteServicio.getTodosClientesManual();
    }
}

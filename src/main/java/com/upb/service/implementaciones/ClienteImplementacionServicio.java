package com.upb.service.implementaciones;

import java.util.List;

import org.springframework.stereotype.Service;

import com.upb.model.entities.Cliente;
import com.upb.model.repositories.ClienteRepositorio;
import com.upb.service.ClienteServicio;

@Service
public class ClienteImplementacionServicio implements ClienteServicio{

    private final ClienteRepositorio clienteRepositorio;

    public ClienteImplementacionServicio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    @Override
    public List<Cliente> getTodosClientes(){
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> getTodosClientesManual(){
        return clienteRepositorio.obtenerTodosClientesManual();
    }
}

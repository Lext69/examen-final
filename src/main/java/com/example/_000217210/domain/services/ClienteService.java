package com.example._000217210.domain.services;

import com.example._000217210.domain.entities.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente create(Cliente cliente);
    List<Cliente> getAll();
    Cliente getByDni(String dni);
    Cliente update(Cliente cliente);
}

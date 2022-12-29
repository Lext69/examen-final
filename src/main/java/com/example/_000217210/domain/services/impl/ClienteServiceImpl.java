package com.example._000217210.domain.services.impl;

import com.example._000217210.domain.entities.Cliente;
import com.example._000217210.domain.repositories.ClienteRepository;
import com.example._000217210.domain.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private ClienteRepository clienteRepository;
    @Override
    public Cliente create(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAll() {
        return this.clienteRepository.getAll();
    }

    @Override
    public Cliente getByDni(String dni) {
        return this.clienteRepository.getByDni(dni);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }
}

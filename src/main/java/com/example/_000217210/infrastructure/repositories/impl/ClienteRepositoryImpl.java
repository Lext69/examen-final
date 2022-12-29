package com.example._000217210.infrastructure.repositories.impl;

import com.example._000217210.domain.entities.Cliente;
import com.example._000217210.domain.repositories.ClienteRepository;
import com.example._000217210.infrastructure.repositories.jpa.ClienteJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ClienteRepositoryImpl implements ClienteRepository {
    private ClienteJpaRepository clienteJpaRepository;
    @Override
    public Cliente save(Cliente cliente) {
        return this.clienteJpaRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAll() {
        return this.clienteJpaRepository.findAll();
    }

    @Override
    public Cliente getOne(Long id) {
        return this.clienteJpaRepository.findById(id).get();
    }

    @Override
    public Cliente getByDni(String dni) {
        return this.clienteJpaRepository.getByDni(dni);
    }

    @Override
    public void delete(Long id) {
        this.clienteJpaRepository.deleteById(id);
    }
}

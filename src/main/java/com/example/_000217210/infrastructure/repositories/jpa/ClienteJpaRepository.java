package com.example._000217210.infrastructure.repositories.jpa;

import com.example._000217210.domain.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteJpaRepository extends JpaRepository<Cliente, Long> {
    Cliente getByDni(String dni);
}

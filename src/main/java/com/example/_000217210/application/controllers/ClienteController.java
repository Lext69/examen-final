package com.example._000217210.application.controllers;

import com.example._000217210.domain.entities.Cliente;
import com.example._000217210.domain.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "clientes")
@AllArgsConstructor
public class ClienteController {
    private ClienteService clienteService;
    @PostMapping
    ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        Cliente cliente1 = this.clienteService.create(cliente);
        return new ResponseEntity<>(cliente1, HttpStatus.CREATED);
    }

    @GetMapping(path = "by-dni/{dni}")
    ResponseEntity<Cliente> getByDni(@PathVariable("dni") String dni){
        Cliente cliente1 = this.clienteService.getByDni(dni);
        return new ResponseEntity<>(cliente1, HttpStatus.CREATED);
    }
}

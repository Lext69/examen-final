package com.example._000217210.application.controllers;

import com.example._000217210.domain.entities.Reporte;
import com.example._000217210.domain.services.ReporteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "reportes")
public class ReporteController {
    private ReporteService reporteService;
    @PostMapping
    ResponseEntity<Reporte> create(@RequestBody Reporte reporte) {
        Reporte reporte1 = this.reporteService.create(reporte);
        return new ResponseEntity<>(reporte1, HttpStatus.CREATED);
    }

}

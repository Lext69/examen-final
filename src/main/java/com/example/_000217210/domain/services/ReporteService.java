package com.example._000217210.domain.services;

import com.example._000217210.domain.entities.Reporte;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ReporteService {
    Reporte create(Reporte reporte);
    List<Reporte> getAll();
    Reporte update(Reporte reporte);
}

package com.example._000217210.domain.repositories;

import com.example._000217210.domain.entities.Reporte;

import java.util.List;

public interface ReporteRepository {
    Reporte save(Reporte reporte);
    List<Reporte> getAll();
    Reporte getOne(Long id);
    void delete(Long id);
}

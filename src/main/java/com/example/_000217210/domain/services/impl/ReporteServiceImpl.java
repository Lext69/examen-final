package com.example._000217210.domain.services.impl;

import com.example._000217210.domain.entities.Reporte;
import com.example._000217210.domain.repositories.ReporteRepository;
import com.example._000217210.domain.services.ReporteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReporteServiceImpl implements ReporteService {
    private ReporteRepository reporteRepository;
    @Override
    public Reporte create(Reporte reporte) {
        return this.reporteRepository.save(reporte);
    }

    @Override
    public List<Reporte> getAll() {
        return this.reporteRepository.getAll();
    }

    @Override
    public Reporte update(Reporte reporte) {
        return this.reporteRepository.save(reporte);
    }
}

package com.entrega.entrega.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategiasFrete;

    public FreteService(List<FreteStrategy> estrategiasFrete) {
        this.estrategiasFrete = estrategiasFrete;
    }

    public double calcular(String modalidade, double peso){
        return estrategiasFrete.stream().filter(e -> e.modalidade().equalsIgnoreCase(modalidade)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Modalidade não encontrada")).calcular(peso);
    }
}
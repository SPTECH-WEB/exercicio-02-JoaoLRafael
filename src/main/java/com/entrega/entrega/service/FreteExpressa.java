package com.entrega.entrega.service;

import org.springframework.stereotype.Component;

@Component
public class FreteExpressa implements FreteStrategy {
    @Override
    public double calcular (double peso){
        return peso * 1.9;
    }

    @Override
    public String modalidade() {
        return "Expressa";
    }
}

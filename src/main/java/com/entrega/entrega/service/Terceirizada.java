package com.entrega.entrega.service;

import org.springframework.stereotype.Component;

@Component
public class Terceirizada implements FreteStrategy {
    @Override
    public double calcular (double peso){
        return peso += 2.0;
    }

    @Override
    public String modalidade(){
        return "Terceirizada";
    }
}

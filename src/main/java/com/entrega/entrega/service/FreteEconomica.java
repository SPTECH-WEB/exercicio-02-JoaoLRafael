package com.entrega.entrega.service;

import org.springframework.stereotype.Component;

@Component
public class FreteEconomica implements  FreteStrategy{
    @Override
    public double calcular(double peso){
        return peso += 12.0;
    }

    @Override
    public String modalidade(){
        return "Economica";
    }
}


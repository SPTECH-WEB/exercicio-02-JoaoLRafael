package com.entrega.entrega.controller;


import com.entrega.entrega.service.FreteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frete")
public class FreteController {
    private final FreteService freteService;

    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping
    public String calcularFrete(@RequestParam String modalidade, @RequestParam double peso){
        double valor = freteService.calcular(modalidade, peso);
        return "Modalidade do frete: " + modalidade + " - Peso: " + peso + "kG - Total: R$" + valor;
    }
}

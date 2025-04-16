package com.example.entregas.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaNormal implements EntregaStrategy {
    @Override
    public double calcular(double peso) {
        return (peso * 0.5) + 10;
    }

    @Override
    public String tipo() {
        return "Transportadora";
    }
}
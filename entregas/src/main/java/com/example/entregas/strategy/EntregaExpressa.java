package com.example.entregas.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements EntregaStrategy {
    @Override
    public double calcular(double peso) {
        return (peso*1.5)+20;
    }

    @Override
    public String tipo() {
        return "Expressa";
    }
}

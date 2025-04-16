package com.example.entregas.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements EntregaStrategy {
    @Override
    public double calcular(double peso){
        return (peso*0.8)+2;
    }

    @Override
    public String tipo(){
        return "Econômica";
    }
}
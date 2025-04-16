package com.example.entregas.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaTransportadora implements EntregaStrategy {
    @Override
    public double calcular(double peso) {
        return 10; //Aqui você substitui pelo o que precisar do adapter
    }

    @Override
    public String tipo() {
        return "Transportadora";
    }
}
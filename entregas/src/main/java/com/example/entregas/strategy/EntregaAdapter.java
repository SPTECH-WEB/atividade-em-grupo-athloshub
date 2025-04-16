package com.example.entregas.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaAdapter implements  EntregaStrategy {

    private final EntregaExternaAPI entregaStrategy;

    public EntregaAdapter(){
    this.entregaStrategy = new EntregaExternaAPI();
    }

    @Override
    public double calcular(double peso) {
        return entregaStrategy.custoEntrega(peso);
    }

    @Override
    public String tipo() {
        return "Transportadora Externa";
    }
}

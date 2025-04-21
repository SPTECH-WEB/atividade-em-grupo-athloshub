package com.example.entregas.service;

import com.example.entregas.model.Pedido;
import com.example.entregas.observer.EntregaObserver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {
    private final List<EntregaObserver> observadores;
    public EntregaService(List<EntregaObserver> observadores) {this.observadores = observadores;}

    public void registrarEntrega(Pedido pedido){
        System.out.println("Entrega"+pedido.getId()+" registrada com sucesso");

        observadores.forEach(obs -> obs.notificar(pedido));
    }
}

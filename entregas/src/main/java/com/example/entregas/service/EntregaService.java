package com.example.entregas.service;

import com.example.entregas.model.Pedido;
import com.example.entregas.observer.EntregaObserver;
import com.example.entregas.repository.EntregaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {
    private final EntregaRepository entregaRepository;
    private final List<EntregaObserver> observadores;

    public EntregaService(EntregaRepository entregaRepository, List<EntregaObserver> observadores) {
        this.entregaRepository = entregaRepository;
        this.observadores = observadores;
    }

    public Pedido registrarEntrega(Pedido pedido){
        System.out.println("Entrega"+pedido.getId()+" registrada com sucesso");

        observadores.forEach(obs -> obs.notificar(pedido));

        return entregaRepository.save(pedido);
    }

    public List<Pedido> listarEntregas(){
        return entregaRepository.findAll();
    }
}

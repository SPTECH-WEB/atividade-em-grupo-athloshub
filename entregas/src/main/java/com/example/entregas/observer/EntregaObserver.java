package com.example.entregas.observer;

import com.example.entregas.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public interface EntregaObserver {
    void notificar(Pedido pedido);
}

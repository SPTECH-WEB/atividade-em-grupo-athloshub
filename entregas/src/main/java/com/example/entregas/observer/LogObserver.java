package com.example.entregas.observer;

import com.example.entregas.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class LogObserver implements EntregaObserver{
    @Override
    public void notificar(Pedido pedido){
        System.out.println("Pedido registrado no log para:"+ pedido.getCliente());
    }
}

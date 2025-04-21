package com.example.entregas.observer;

import com.example.entregas.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoObserver implements EntregaObserver{
    @Override
    public void notificar(Pedido pedido){
        System.out.println("Notificação enviada para: "+ pedido.getCliente());
    }
}

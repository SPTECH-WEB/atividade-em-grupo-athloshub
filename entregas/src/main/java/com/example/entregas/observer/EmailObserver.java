package com.example.entregas.observer;

import com.example.entregas.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class EmailObserver implements EntregaObserver{
    @Override
    public void notificar(Pedido pedido){
        System.out.println("E-mail enviado para "+pedido.getCliente());
    }
}

package com.example.entregas.model;
import jakarta.persistence.*;


@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cliente;
    private String produto;
    private Double peso;
    private String tipoEntrega;


}
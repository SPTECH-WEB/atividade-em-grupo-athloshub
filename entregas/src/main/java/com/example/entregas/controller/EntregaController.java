package com.example.entregas.controller;

import com.example.entregas.model.Pedido;
import com.example.entregas.service.EntregaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class EntregaController {

    private final EntregaService entregaService;
    public EntregaController(EntregaService entregaService) {
        this.entregaService = entregaService;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarEntregas(){
        return ResponseEntity.ok(entregaService.listarEntregas());
    }

    @PostMapping
    public ResponseEntity<Pedido> registrarEntrega(@RequestBody Pedido pedido){
        return ResponseEntity.status(201).body(entregaService.registrarEntrega(pedido));
    }
}

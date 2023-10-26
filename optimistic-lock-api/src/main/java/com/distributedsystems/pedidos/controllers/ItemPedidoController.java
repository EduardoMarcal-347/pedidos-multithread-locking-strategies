package com.distributedsystems.pedidos.controllers;


import com.distributedsystems.pedidos.entities.ItemPedido;
import com.distributedsystems.pedidos.services.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/itempedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService service;

    @GetMapping()
    public ResponseEntity<List<ItemPedido>> findAll(){
        return service.findAll();
    }

    @GetMapping("id/{id}")
    public ResponseEntity<ItemPedido> findById(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PostMapping()
    public ResponseEntity<ItemPedido> save(@RequestBody ItemPedido item){
        return service.save(item);
    }
}

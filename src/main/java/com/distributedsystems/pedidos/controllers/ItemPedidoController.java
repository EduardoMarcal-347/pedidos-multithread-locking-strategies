package com.distributedsystems.pedidos.controllers;


import com.distributedsystems.pedidos.entities.ItemPedido;
import com.distributedsystems.pedidos.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/itempedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService service;

    @GetMapping()
    public List<ItemPedido> findAll(){
        return service.findAll();
    }

    @GetMapping("id/{id}")
    public Optional<ItemPedido> findById(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PostMapping()
    public Optional<ItemPedido> save(@RequestBody ItemPedido item){
        return service.save(item);
    }
}

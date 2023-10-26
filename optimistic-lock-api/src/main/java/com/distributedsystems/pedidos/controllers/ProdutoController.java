package com.distributedsystems.pedidos.controllers;

import com.distributedsystems.pedidos.entities.Produto;
import com.distributedsystems.pedidos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping()
    public ResponseEntity<List<Produto>> findAll() {
        return service.findAll();
    }

    @PostMapping()
    public ResponseEntity<Produto> save(@RequestBody Produto produto){
        return service.save(produto);
    }
}

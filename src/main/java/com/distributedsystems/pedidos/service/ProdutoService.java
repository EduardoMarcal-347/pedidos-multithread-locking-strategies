package com.distributedsystems.pedidos.service;

import com.distributedsystems.pedidos.entities.Produto;
import com.distributedsystems.pedidos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Produto save(Produto produto){
        return repository.save(produto);
    }
}

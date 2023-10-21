package com.distributedsystems.pedidos.service;

import com.distributedsystems.pedidos.entities.Produto;
import com.distributedsystems.pedidos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public ResponseEntity<Produto> save(Produto produto){
        if(produto.getDesProduto().isBlank() || produto.getDesProduto().isEmpty() || produto.getQtdEstoque() < 0)
            return ResponseEntity.badRequest().build();
        produto.setCodVrs(1);
        return new ResponseEntity<>(repository.save(produto), HttpStatus.CREATED);
    }
}

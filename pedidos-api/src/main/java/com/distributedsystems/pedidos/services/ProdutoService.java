package com.distributedsystems.pedidos.services;

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

    public ResponseEntity<List<Produto>> findAll() {
        if (repository.findAll().size() == 0) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(repository.findAll());
    }

    public ResponseEntity<Produto> save(Produto produto){
        if(produto.getDesProduto().isBlank() || produto.getDesProduto().isEmpty() || produto.getQtdEstoque() < 0)
            return ResponseEntity.badRequest().build();
        produto.setCodVrs(1);
        return new ResponseEntity<>(repository.save(produto), HttpStatus.CREATED);
    }
}

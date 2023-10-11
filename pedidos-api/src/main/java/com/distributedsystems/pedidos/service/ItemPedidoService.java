package com.distributedsystems.pedidos.service;

import com.distributedsystems.pedidos.entities.ItemPedido;
import com.distributedsystems.pedidos.entities.Produto;
import com.distributedsystems.pedidos.repositories.ItemPedidoRepository;
import com.distributedsystems.pedidos.repositories.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ItemPedido> findAll() {
        return itemPedidoRepository.findAll();
    }

    public Optional<ItemPedido> findById(Long id){
        return itemPedidoRepository.findById(id);
    }

    @Transactional
    public ResponseEntity<ItemPedido> save(ItemPedido item) {
        var produto = produtoRepository.findById(item.getCodProduto());
        if (produto.isEmpty()) {
            System.out.println("produto inexistente");
            return ResponseEntity.notFound().build();
        }
        if (item.getQtdItem() == 0) {
            System.out.println("o item deve conter pelo menos 1 produto");
            return ResponseEntity.badRequest().build();
        } else if (item.getQtdItem() > produto.get().getQtdEstoque()) {
            System.out.println("qtd insuficiente");
            return ResponseEntity.badRequest().build();
        }
        produto.get().setQtdEstoque(produto.get().getQtdEstoque() - item.getQtdItem());
        produtoRepository.save(produto.get());

        return new ResponseEntity<ItemPedido>(itemPedidoRepository.save(item), HttpStatus.CREATED);
    }
}

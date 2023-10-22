package com.distributedsystems.pedidos.services;

import com.distributedsystems.pedidos.entities.ItemPedido;
import com.distributedsystems.pedidos.entities.Produto;
import com.distributedsystems.pedidos.repositories.ItemPedidoRepository;
import com.distributedsystems.pedidos.repositories.ProdutoRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private EntityManager entityManager;

    public ResponseEntity<List<ItemPedido>> findAll() {
        if (itemPedidoRepository.findAll().isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(itemPedidoRepository.findAll());
    }

    public ResponseEntity<ItemPedido>findById(Long id){
        if (!itemPedidoRepository.findById(id).isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(itemPedidoRepository.findById(id).get());
    }

    @Transactional
    public ResponseEntity<ItemPedido> save(ItemPedido item) {
        Session session = entityManager.unwrap(Session.class);
        var dbProduto = produtoRepository.findById(item.getCodProduto());
        if (!dbProduto.isPresent()) {
            System.out.println("produto inexistente");
            return ResponseEntity.notFound().build();
        }

        Produto produto = session.get(Produto.class, item.getCodProduto(), LockMode.PESSIMISTIC_READ);

        if (item.getQtdItem() == 0) {
            System.out.println("o item deve conter pelo menos 1 produto");
            return ResponseEntity.badRequest().build();
        } else if (item.getQtdItem() > produto.getQtdEstoque()) {
            System.out.println("qtd insuficiente");
            return ResponseEntity.badRequest().build();
        }
        produto.setQtdEstoque(produto.getQtdEstoque() - item.getQtdItem());
        produtoRepository.save(produto);

        return new ResponseEntity<ItemPedido>(itemPedidoRepository.save(item), HttpStatus.CREATED);
    }
}

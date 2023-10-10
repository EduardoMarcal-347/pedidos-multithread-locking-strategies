package com.distributedsystems.pedidos.service;

import com.distributedsystems.pedidos.entities.ItemPedido;
import com.distributedsystems.pedidos.repositories.ItemPedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository repository;

    public List<ItemPedido> findAll() {
        return repository.findAll();
    }

    public Optional<ItemPedido> findById(Long id){
        return repository.findById(id);
    }

    @Transactional
    public Optional<ItemPedido> save(ItemPedido item) {
        if (item.getProduto() != null && item.getQtdItem() > 0 && item.getProduto().getQtdEstoque() <= item.getQtdItem()) {
            return Optional.of(repository.save(item));
        } else return null;
    }


}

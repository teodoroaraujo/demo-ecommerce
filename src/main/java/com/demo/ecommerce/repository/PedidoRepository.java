package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{


}

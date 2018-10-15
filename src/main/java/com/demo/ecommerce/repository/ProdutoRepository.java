package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{


}

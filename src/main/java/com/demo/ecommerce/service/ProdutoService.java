package com.demo.ecommerce.service;

import java.util.Optional;

import com.demo.ecommerce.entity.Produto;

public interface ProdutoService {

	Optional<Produto> findById(Long id);
}

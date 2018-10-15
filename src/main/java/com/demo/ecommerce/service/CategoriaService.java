package com.demo.ecommerce.service;

import java.util.Optional;

import com.demo.ecommerce.entity.Categoria;

public interface CategoriaService {

	Optional<Categoria> findById(Long id);
}

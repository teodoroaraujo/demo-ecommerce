package com.demo.ecommerce.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.entity.Categoria;
import com.demo.ecommerce.repository.CategoriaRepository;
import com.demo.ecommerce.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public Optional<Categoria> findById(Long id) {
		
		return categoriaRepository.findById(id);
	}

}

package com.demo.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.entity.Categoria;
import com.demo.ecommerce.exception.ObjectNotFoundException;
import com.demo.ecommerce.repository.CategoriaRepository;
import com.demo.ecommerce.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public Categoria findById(Long id) {
		return categoriaRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Categoria não encontrado para o id informado"));

	}

}

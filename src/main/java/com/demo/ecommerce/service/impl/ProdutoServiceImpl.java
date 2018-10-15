package com.demo.ecommerce.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.entity.Produto;
import com.demo.ecommerce.repository.ProdutoRepository;
import com.demo.ecommerce.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public Optional<Produto> findById(Long id) {

		return produtoRepository.findById(id);
	}

}

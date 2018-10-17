package com.demo.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.entity.Cliente;
import com.demo.ecommerce.exception.ObjectNotFoundException;
import com.demo.ecommerce.repository.ClienteRepository;
import com.demo.ecommerce.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente findById(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Categoria não encontrado para o id informado"));

	}

}

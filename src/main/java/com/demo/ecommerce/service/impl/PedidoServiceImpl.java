package com.demo.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.entity.Pedido;
import com.demo.ecommerce.exception.ObjectNotFoundException;
import com.demo.ecommerce.repository.PedidoRepository;
import com.demo.ecommerce.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public Pedido findById(Long id) {
		return pedidoRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Pedido não encontrado para o id informado"));

	}

}

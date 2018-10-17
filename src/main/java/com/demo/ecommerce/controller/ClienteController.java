package com.demo.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.entity.Cliente;
import com.demo.ecommerce.service.ClienteService;

@RestController
@RequestMapping(value = "clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Long id) {
		Cliente clientet = clienteService.findById(id);
		return ResponseEntity.ok().body(clientet);
	}

}

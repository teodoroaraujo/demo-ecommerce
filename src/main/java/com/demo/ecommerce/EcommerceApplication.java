package com.demo.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.ecommerce.entity.Categoria;
import com.demo.ecommerce.repository.CategoriaRepository;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner{

	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		categoriaRepository.saveAll(java.util.Arrays.asList(cat1, cat2));
		
	}
}

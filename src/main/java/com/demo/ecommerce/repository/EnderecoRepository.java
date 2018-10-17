package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{


}

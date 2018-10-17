package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{


}

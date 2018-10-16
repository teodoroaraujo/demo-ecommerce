package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.entity.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{


}

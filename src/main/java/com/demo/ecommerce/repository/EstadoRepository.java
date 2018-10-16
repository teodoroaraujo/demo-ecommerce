package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.entity.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{


}

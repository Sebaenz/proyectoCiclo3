package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ecommerce.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

}

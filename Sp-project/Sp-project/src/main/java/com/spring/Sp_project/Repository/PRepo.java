package com.spring.Sp_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Sp_project.Model.Product;

@Repository
public interface PRepo extends JpaRepository<Product, Integer > {

}

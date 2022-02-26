package com.example.week1.repositories;

import com.example.week1.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository <Products, Integer>{
    @Query("SELECT p FROM Products p WHERE p.name LIKE %:name%")
    List<Products> findByName(String name);
}

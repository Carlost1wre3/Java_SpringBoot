package com.example.geladeira.repository;

import com.example.geladeira.model.Food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository <Food, Long> {
    
}
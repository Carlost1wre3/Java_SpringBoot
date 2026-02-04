package com.example.geladeira.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geladeira.model.Food;
import com.example.geladeira.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/food")
public class controller {
    
    private final FoodService foodService;

    public controller(FoodService foodService) {
        this.foodService = foodService;
    }
    

    @GetMapping
    public List<Food> getall() {return foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food) {return foodService.save(food);}

    @DeleteMapping
    public void delete(@PathVariable Long id) {foodService.delete(id);} 

}

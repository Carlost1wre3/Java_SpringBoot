package com.example.geladeira.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.geladeira.repository.FoodRepository;
import com.example.geladeira.model.Food;

@Service
public class FoodService{

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;  
    }
    
    public List<Food> getAll() {return foodRepository.findAll();}

    public Food save(Food food) {return foodRepository.save(food);}

    public void delete(Long id) {foodRepository.deleteById(id);}

}  
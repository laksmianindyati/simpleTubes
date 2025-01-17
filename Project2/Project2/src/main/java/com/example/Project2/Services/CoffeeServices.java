package com.example.Project2.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Project2.Model.Coffee;

@Service
public class CoffeeServices {
    private List<Coffee> coffees = new ArrayList<>();
    
    public CoffeeServices() {
        coffees.addAll(List.of(new Coffee("Cafe Gerenza"), 
        new Coffee("Cafe Ganador"), 
        new Coffee("Cafe Lareno"), 
        new Coffee("Cafe Tres Pontas")));
    }

    List<Coffee> getAllData(){
        return coffees;
    }
}

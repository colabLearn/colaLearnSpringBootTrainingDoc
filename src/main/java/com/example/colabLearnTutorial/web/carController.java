package com.example.colabLearnTutorial.web;

import com.example.colabLearnTutorial.domain.Car;
import com.example.colabLearnTutorial.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class carController {
    @Autowired
    private CarRepository repository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){

        return repository.findAll();
    }
}


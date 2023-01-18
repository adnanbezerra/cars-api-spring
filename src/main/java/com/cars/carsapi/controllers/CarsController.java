package com.cars.carsapi.controllers;

import com.cars.carsapi.dto.NewCarDTO;
import com.cars.carsapi.models.Car;
import com.cars.carsapi.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarRepository repository;

    @PostMapping
    private void postCar(@RequestBody NewCarDTO req) {
        repository.save(new Car(req));
    }

    @GetMapping
    private List<Car> findAll() {
        return repository.findAll();
    }
}

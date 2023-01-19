package com.cars.carsapi.controllers;

import com.cars.carsapi.dto.NewCarDTO;
import com.cars.carsapi.models.Car;
import com.cars.carsapi.repositories.CarRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarRepository repository;

    @PostMapping
    public void postCar(@RequestBody @Valid NewCarDTO req) {
        repository.save(new Car(req));
    }

    @GetMapping
    public List<Car> findAll() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody @Valid NewCarDTO req) {
        Car newCar = repository.findById(id);
        if(newCar == null) {
            throw E;
        }
        newCar = new Car(req);
        repository.save(newCar);
    }
}

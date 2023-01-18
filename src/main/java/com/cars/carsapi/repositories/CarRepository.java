package com.cars.carsapi.repositories;

import com.cars.carsapi.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}

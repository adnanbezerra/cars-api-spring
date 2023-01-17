package com.cars.carsapi.controllers;

import com.cars.carsapi.dto.NewCarDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    @PostMapping
    private void postCar(@RequestBody NewCarDTO req) {
        System.out.println(req.anoModelo());
        System.out.println(req.valor());
        System.out.println(req.fabricante());
        System.out.println(req.modelo());
        System.out.println(req.dataFabricacao());
    }
}

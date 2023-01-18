package com.cars.carsapi.models;

import com.cars.carsapi.dto.NewCarDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

    public Car(NewCarDTO newCar) {
        this.anoModelo = newCar.anoModelo();
        this.dataFabricacao = newCar.dataFabricacao();
        this.fabricante = newCar.fabricante();
        this.modelo = newCar.modelo();
        this.valor = newCar.valor();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private String modelo;

    @Column(length = 30)
    private String fabricante;

    @Column(length = 30)
    private String dataFabricacao;

    @Column(length = 30)
    private double valor;

    @Column(length = 30)
    private String anoModelo;
}

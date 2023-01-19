package com.cars.carsapi.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.util.Date;

public record NewCarDTO(
        @NotNull
        String modelo,

        @NotNull
        String fabricante,

        @NotNull
        @Past
        Date dataFabricacao,

        @NotNull
        double valor,

        @NotNull
        @Past
        Date anoModelo
) {}

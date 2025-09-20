package com.metro.rutas;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RutaMetroController {

    @GetMapping("/rutas")
    public List<RutaMetro> obtenerRutas() {
        return Arrays.asList(
            new RutaMetro("Línea A", "Niquía", "La Estrella"),
            new RutaMetro("Línea B", "San Javier", "San Antonio"),
            new RutaMetro("Línea C", "San Antonio", "La Aurora")
        );
    }
}
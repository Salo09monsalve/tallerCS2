package com.metro.rutas.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.metro.rutas.services.RutaMetro;

@Controller
public class RutaMetroController {

    private List<RutaMetro> datos() {
        return Arrays.asList(
            new RutaMetro("Línea A", "Niquía", "La Estrella"),
            new RutaMetro("Línea B", "San Javier", "San Antonio"),
            new RutaMetro("Línea C", "San Antonio", "La Aurora")
        );
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("rutas", datos());
        return "index";
    }

 
}
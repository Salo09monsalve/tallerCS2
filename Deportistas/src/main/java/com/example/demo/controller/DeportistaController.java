package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Deportista;

@Controller
public class DeportistaController {

    @GetMapping("/deportistas")
    public String listarDeportistas(Model model) {
        List<Deportista> lista = new ArrayList<>();
        lista.add(new Deportista(1, "Mariana", 19, "Voleybol"));
        lista.add(new Deportista(2, "Sebastian", 21, "Futbol"));
        lista.add(new Deportista(3, "Juan", 20, "Baloncesto"));

        model.addAttribute("deportistas", lista);
        return "deportistas";
    }
}

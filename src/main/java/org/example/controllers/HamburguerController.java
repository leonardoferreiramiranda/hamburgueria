package org.example.controllers;


import org.example.models.Hamburguer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/hamburguers")
public class HamburguerController {

private List<Hamburguer> hamburguers = new ArrayList<>( List.of(
        new Hamburguer("# Qr Burger",
                22.90,
                "Pão brioche, 1 Blend 150g, 2 fatias de queijo Cheddar, Bacon, Cebola Caramelizada, Alface, Tomate e Maionese.",
                "google.com.br"),
        new Hamburguer("# Qr Smash",
                19.90,
                "Pão brioche, 1 Blend 90g, 2 fatias de queijo Cheddar, Bacon, Alface, Tomate, Cebola Caramelizada e Maionese.",
                "google.com.br"),
        new Hamburguer("# Qr Duplo Smash",
                24.90,
                "Pão brioche, 2 Blends de 90g, 4 fatias de queijo Cheddar, Bacon, Alface, Tomate, Cebola Caramelizada e Maionese.",
                "google.com.br"),
        new Hamburguer("# Qr Doritos",
                24.90,
                "Pão brioche, 1 Blend 150g, 2 fatias de queijo Cheddar, Alface , Tomate, Maionese e Doritos",
                "google.co.br"),
        new Hamburguer("# Qr Duplo",
                29.90,
                "Pão brioche, 2 Blends 150g, 4 fatias de queijo Cheddar, Bacon, Alface, Tomate, Cebola Caramelizada e Maionese",
                "giigaksdj,.cisdsd,s")
));
    @GetMapping()
    public List<Hamburguer> index() {
        return hamburguers;
    }

    @GetMapping("/{position}")
    public Hamburguer get(@PathVariable("position") int position) {
        return hamburguers.get(position);
    }

    @DeleteMapping("/{position}")
    public Hamburguer delete(@PathVariable("position") int position) {
        return hamburguers.remove(position);
    }
}


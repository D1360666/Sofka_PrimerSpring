package com.sofka.ej1ApiRest.Sofka.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerUsuario {
    @GetMapping(value="/saludo")
    public String saludo() {
        return "Hola Sofka";
    }
}

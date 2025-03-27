package com.example.aplicacion1.appCine1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaMundoController {

    @GetMapping
    public String holaMundo() {
        return "¡Hola Mundo implementando Spring boot, bien hecho Robin!";
    }
}

package com.cinema_premier.cinema_premier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ControladorRest {
    @GetMapping("/")
    public String comienzo() {
        log.info("Estoy ejecutando el controlador rest");
        log.debug("mas informacion");
        return "Hola mundo desde spring boot";
    }

}

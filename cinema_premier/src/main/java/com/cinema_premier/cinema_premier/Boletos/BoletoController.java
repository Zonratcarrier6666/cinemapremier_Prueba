package com.cinema_premier.cinema_premier.Boletos;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
@CrossOrigin(origins = "http://localhost:5500") // Reemplaza con el origen de tu frontend
@RestController
@RequiredArgsConstructor
public class BoletoController {
    private final BoletoService boletoService;

    @GetMapping("/boletos/movies-months")
    public List<Boleto> getMoviesAndMonth() {
        return boletoService.getMoviesAndMonth();
    }
}

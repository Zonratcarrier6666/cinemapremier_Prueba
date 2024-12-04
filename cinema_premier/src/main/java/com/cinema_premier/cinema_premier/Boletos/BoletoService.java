package com.cinema_premier.cinema_premier.Boletos;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoletoService {
    @Autowired
    private BoletoRepository boletoRepository;

    public List<Boleto> getMoviesAndMonth() {
        // Suponiendo que getMoviesAndMonth devuelve una lista de Object[] donde
        // el primer elemento es el nombre de la película y el segundo el número de la
        // sala.
        return boletoRepository.getMoviesAndMonth().stream()
            .map(result -> new Boleto(
                    (String) result[0],  // Película (String)
                    ((Long) result[1]).intValue()))  // Mes (convertido a Integer desde Long)
            .collect(Collectors.toList());
    }
}

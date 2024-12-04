package com.cinema_premier.cinema_premier.Boletos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoletoRepository extends JpaRepository<Boleto, Integer> {
    @Query(value = "SELECT movie, MONTH(date_print) AS monthOfPrint FROM boleto", nativeQuery = true)
    List<Object[]> getMoviesAndMonth();
}

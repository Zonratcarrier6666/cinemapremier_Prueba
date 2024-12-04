package com.cinema_premier.cinema_premier.Boletos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    private int idBoleto;

    @Column(name = "branch") // Opcional si el nombre coincide
    private String branch;

    private int hall; // Se asume que coincide con la base de datos

    @Column(name = "classification") // Opcional si coincide con la tabla
    private String classification;

    private String movie;
    private String filmFunction;
    private String datePrint;

    public Boleto(String movie, int hall) {
        this.movie = movie;
        this.hall = hall;
    }

    // Getters y Setters (Requeridos para JPA)
    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getHall() {
        return hall;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getFilmFunction() {
        return filmFunction;
    }

    public void setFilmFunction(String filmFunction) {
        this.filmFunction = filmFunction;
    }

    public String getDatePrint() {
        return datePrint;
    }

    public void setDatePrint(String datePrint) {
        this.datePrint = datePrint;
    }
}

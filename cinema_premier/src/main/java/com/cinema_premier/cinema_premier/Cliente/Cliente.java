package com.cinema_premier.cinema_premier.Cliente;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
public class Cliente {
    @Id
    @GeneratedValue
    private int idClient;
    @Basic
    private String nameClient;
    private String typeClient;
    private String mail;
    private String phone;
    private String date;

}

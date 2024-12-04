package com.cinema_premier.cinema_premier.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PearsonRepository extends JpaRepository<Cliente, Integer>{

}

package com.microservices.encadreur.Repository;

import com.microservices.encadreur.Models.Encadreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncadreurRepo   extends JpaRepository<Encadreur, Integer> {

}

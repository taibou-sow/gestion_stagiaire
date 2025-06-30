package com.microservices.stagiaire.Repository;

import com.microservices.stagiaire.Models.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StagiaireRepo extends JpaRepository<Stagiaire, Integer> {
}

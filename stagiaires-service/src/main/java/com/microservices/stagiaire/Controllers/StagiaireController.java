package com.microservices.stagiaire.Controllers;

import com.microservices.stagiaire.Models.Stagiaire;
import com.microservices.stagiaire.services.StagiaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/stagiaires")
public class StagiaireController {
    StagiaireService service;

    @GetMapping
    public List<Stagiaire> getStagiaires() {
        return service.getAllStagiaire();
    }

    @GetMapping("/{id}")
    public Optional<Stagiaire> getStagiaireById(@PathVariable int id) {
        return service.getStagiaireById(id);
    }

    @PostMapping
    public void addStagiaire(@RequestBody Stagiaire stagiaire) {
        service.addStagiaire(stagiaire);
    }

    @PutMapping("/{id}")
    public void updateStagiaire(@PathVariable int id,@RequestBody Stagiaire stagiaire) {
        service.updateStagiare(id, stagiaire);
    }

    @DeleteMapping("/{id}")
    public void deleteStagiaire(@PathVariable int id) {
        service.deleteStagiaireById(id);
    }
}

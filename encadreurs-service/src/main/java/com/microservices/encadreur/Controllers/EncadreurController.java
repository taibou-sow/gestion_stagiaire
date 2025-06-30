package com.microservices.encadreur.Controllers;

import com.microservices.encadreur.Models.Encadreur;
import com.microservices.encadreur.services.EncadreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/encadreurs")
public class EncadreurController {

    private final EncadreurService service;

    @Autowired
    public EncadreurController(EncadreurService service) {
        this.service = service;
    }

    @GetMapping
    public List<Encadreur> getAllEncadreurs() {
        return service.getAllEncadreurs();
    }

    @GetMapping("/{id}")
    public Optional<Encadreur> getEncadreurById(@PathVariable int id) {
        return service.getEncadreurById(id);
    }

    @PostMapping
    public void addEncadreur(@RequestBody Encadreur encadreur) {
        service.addEncadreur(encadreur);
    }

    @PutMapping("/{id}")
    public void updateEncadreur(@PathVariable int id, @RequestBody Encadreur encadreur) {
       service.updateEncadreur(id, encadreur);
    }

    @DeleteMapping("/{id}")
    public void deleteEncadreur(@PathVariable int id) {
        service.deleteEncadreur(id);
    }
}

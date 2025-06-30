package com.microservices.stagiaire.services;

import com.microservices.stagiaire.Models.Stagiaire;
import com.microservices.stagiaire.Repository.StagiaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StagiaireService  {
    @Autowired
    private StagiaireRepo stagiaireRepo;

    //Pour lister les stagiaires
    public List<Stagiaire> getAllStagiaire() {
        return stagiaireRepo.findAll();
    }

    //Pour recuperer un stagiaire
    public Optional<Stagiaire> getStagiaireById(int id) {
        return stagiaireRepo.findById(id);
    }

    //Pour creer un stagiaire
    public void addStagiaire(Stagiaire stagiaire) {
        stagiaireRepo.save(stagiaire);
    }

    //Pour la mise a jour un stagiaire
    public void updateStagiare(int id, Stagiaire stagiaire) {
        stagiaireRepo.findById(id).ifPresent(element->{
            element.setNom(stagiaire.getNom());
            element.setPrenom(stagiaire.getPrenom());
            element.setEmail(stagiaire.getEmail());
            element.setDateDebut(stagiaire.getDateDebut());
            element.setDateFin(stagiaire.getDateFin());
            element.setEncadreur(stagiaire.getEncadreur());
            stagiaireRepo.save(element);
        });
    }

    //Pour La suppression un stagiaire
    public void deleteStagiaireById(int id) {
        Optional<Stagiaire> stagiaire = stagiaireRepo.findById(id);
        if(stagiaire.isPresent()) {
            stagiaireRepo.delete(stagiaire.get());
        }else{
            System.out.println("Le stagiaire n'existe pas");
        }
    }

}

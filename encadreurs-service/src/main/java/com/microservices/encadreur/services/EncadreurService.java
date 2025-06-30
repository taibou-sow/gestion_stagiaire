package com.microservices.encadreur.services;

import com.microservices.encadreur.Models.Encadreur;
import com.microservices.encadreur.Repository.EncadreurRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncadreurService {
    @Autowired
    private EncadreurRepo encadreurSQL;
    //Pour la creation des Encadreurs
    public void addEncadreur(Encadreur encadreur) {
        encadreurSQL.save(encadreur);
    }

    //Pour lister les encadreurs
    public List<Encadreur> getAllEncadreurs() {
        return encadreurSQL.findAll();
    }

    //Pour lister un Encadreur en fonction de son id
    public Optional<Encadreur> getEncadreurById(int id) {
        return encadreurSQL.findById(id);
    }

    //Pour la mise a jour d'un Encadreur :
    @Transactional

    public void updateEncadreur(int id,Encadreur encadreur) {
        encadreurSQL.findById(id)
                .ifPresent(elem -> {
                    elem.setNom(encadreur.getNom());
                    elem.setPrenom(encadreur.getPrenom());
                    elem.setEmail(encadreur.getEmail());
                    elem.setTelephone(encadreur.getTelephone());
                    encadreurSQL.save(elem);
                });

    }

    //Pour la suppression d'un Encadreur
    public void deleteEncadreur(int id) {
        Optional<Encadreur> encadreur = encadreurSQL.findById(id);
        if (encadreur.isPresent()) {
            encadreurSQL.delete(encadreur.get());
        }else{
            System.out.println("Encadreur Inexistent !!! ");
        }

    }
}

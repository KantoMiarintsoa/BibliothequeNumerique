package com.hasinarezida.biblio.service;

import com.hasinarezida.biblio.models.Auteur;
import com.hasinarezida.biblio.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurService {
    @Autowired
    private AuteurRepository repository;


    public  Auteur ajouterAuteur(Auteur auteur) {
        return repository.save(auteur);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Optional<Auteur> findById(Long id) {
        return repository.findById(id);
    }

    public List<Auteur> findByNom(String nom) {
        return repository.findByUsername(nom);
    }
    
    public boolean existEmail(String email){

        boolean test= !repository.findByEmail(email).isEmpty();
        return test;
    }
}


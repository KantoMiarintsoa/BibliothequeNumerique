package com.hasinarezida.biblio.service;

import com.hasinarezida.biblio.models.Auteur;
import com.hasinarezida.biblio.repository.auteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class auteurService  {
    @Autowired
    private auteurRepository repository;


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
        return repository.findByPseudo(nom);
    }
}


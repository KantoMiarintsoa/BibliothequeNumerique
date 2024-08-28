package com.hasinarezida.biblio.service;

import com.hasinarezida.biblio.models.Lecteur;
import com.hasinarezida.biblio.models.Personne;
import com.hasinarezida.biblio.repository.lecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class lecteurService {
    @Autowired
    private lecteurRepository repository;

    public Personne ajouterLecteur(Lecteur lecteur) {
        return repository.save(lecteur);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Optional<Lecteur> findById(Long id) {
        return repository.findById(id);
    }

    public List<Personne> findByNom(String nom) {
        return repository.findByNom(nom);
    }
}




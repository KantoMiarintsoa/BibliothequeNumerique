package com.hasinarezida.biblio.service;

import com.hasinarezida.biblio.models.Lecteur;
import com.hasinarezida.biblio.models.Personne;
import com.hasinarezida.biblio.repository.LecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.hasinarezida.biblio.repository.LecteurRepository.*;

@Service
public class LecteurService {
    @Autowired
    private LecteurRepository repository;

    public Personne ajouterLecteur(Lecteur lecteur) {
        return repository.save(lecteur);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Optional<Lecteur> findById(Long id) {
        return repository.findById(id);
    }

    public List<Lecteur> findByNom(String nom) {
        return repository.findByUsername(nom);
    }

    public static boolean emailExists(String email) {
        return findByEmail(email);
    }

    public void saveLecteur(Lecteur lecteur) {
        Lecteur save = repository.save(lecteur);
    }

    public Lecteur registerLecteur(String login, String password, String email) {
        if (login == null || password == null) {


        }
        return null;
    }
}

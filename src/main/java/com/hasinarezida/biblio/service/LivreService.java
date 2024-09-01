package com.hasinarezida.biblio.service;

import com.hasinarezida.biblio.models.Livre;
import com.hasinarezida.biblio.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LivreService {
    @Autowired
    private LivreRepository repository;
    public Livre ajouterLivre(Livre livre) {
        return repository.save(livre);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Optional<Livre> findById(Long id) {
        return repository.findById(id);
    }

    public List<Livre> findByNom(String titre) {
        return repository.findByTitreContaining(titre);
    }
}

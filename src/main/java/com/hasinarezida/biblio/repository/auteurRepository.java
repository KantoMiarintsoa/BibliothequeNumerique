package com.hasinarezida.biblio.repository;

import com.hasinarezida.biblio.models.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface auteurRepository extends JpaRepository<Auteur,Long> {
    List<Auteur> findByPseudo(String pseudo);

}



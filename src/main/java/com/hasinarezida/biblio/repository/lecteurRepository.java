package com.hasinarezida.biblio.repository;

import com.hasinarezida.biblio.models.Auteur;
import com.hasinarezida.biblio.models.Lecteur;
import com.hasinarezida.biblio.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface lecteurRepository  extends JpaRepository<Lecteur, Long> {
    List<Personne> findByNom(String nom);

}

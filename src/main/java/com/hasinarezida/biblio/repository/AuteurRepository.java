package com.hasinarezida.biblio.repository;

import com.hasinarezida.biblio.models.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuteurRepository extends JpaRepository<Auteur,Long> {
    List<Auteur> findByUsername(String username);
    List<Auteur> findByEmail(String email);
}




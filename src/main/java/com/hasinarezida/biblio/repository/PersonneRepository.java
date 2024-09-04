package com.hasinarezida.biblio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hasinarezida.biblio.models.Personne;
import jakarta.persistence.Persistence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}




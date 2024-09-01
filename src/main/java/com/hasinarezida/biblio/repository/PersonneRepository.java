package com.hasinarezida.biblio.repository;

import jakarta.persistence.Persistence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Persistence, Long> {
}

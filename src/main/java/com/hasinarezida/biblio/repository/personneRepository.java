package com.hasinarezida.biblio.repository;

import jakarta.persistence.Persistence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personneRepository  extends JpaRepository<Persistence, Long> {
}

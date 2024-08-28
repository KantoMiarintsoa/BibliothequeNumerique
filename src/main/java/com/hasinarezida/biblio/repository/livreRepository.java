package com.hasinarezida.biblio.repository;

import com.hasinarezida.biblio.models.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface livreRepository  extends JpaRepository<Livre, Long> {
    List<Livre> findByTitreContaining(String titre);

}



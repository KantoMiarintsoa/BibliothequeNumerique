package com.hasinarezida.biblio.repository;

import com.hasinarezida.biblio.models.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface livreRepository  extends JpaRepository<Livre, Long> {
}

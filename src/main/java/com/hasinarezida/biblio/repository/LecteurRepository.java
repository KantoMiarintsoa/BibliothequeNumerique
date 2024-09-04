package com.hasinarezida.biblio.repository;

import com.hasinarezida.biblio.models.Lecteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LecteurRepository extends JpaRepository<Lecteur, Long> {
    static boolean findByEmail(String email) {
        return false;
    }


    @Query("SELECT l FROM Lecteur l WHERE l.username = :username")
    List<Lecteur> findByUsername(@Param("username") String username);
}








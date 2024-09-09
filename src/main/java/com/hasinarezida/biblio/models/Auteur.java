package com.hasinarezida.biblio.models;
import jakarta.persistence.*;

import java.util.List;

@Data
@Entity
//@DiscriminatorValue("AUTEUR")
public class Auteur extends Personne {
    @Column(nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    @OneToMany(mappedBy = "auteur" ,fetch=FetchType.EAGER)
    private List<Livre>livres;

    public List<Livre> getLivres() {
        return livres;
    }
}

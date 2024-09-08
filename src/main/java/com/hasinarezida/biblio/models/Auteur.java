package com.hasinarezida.biblio.models;
import jakarta.persistence.*;

import java.util.List;

@Data
@Entity
//@DiscriminatorValue("AUTEUR")
public class Auteur extends Personne {

    @Column(name = "pseudo")
    private String pseudo;



    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    @OneToMany(mappedBy = "auteur" ,fetch=FetchType.EAGER)
    private List<Livre>livres;

    public List<Livre> getLivres() {
        return livres;
    }
}

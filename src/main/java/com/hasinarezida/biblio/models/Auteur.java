package com.hasinarezida.biblio.models;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "auteur")
public class Auteur extends Personne {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "pseudo")
    private String pseudo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}

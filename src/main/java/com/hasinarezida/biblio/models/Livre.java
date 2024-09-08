package com.hasinarezida.biblio.models;

import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;

import java.util.Date;
@Data
@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private String Editeur;
    private String Edition;
    private Date AnneeEdition;
    private long cathegories_Id;
    private Date DateSortie;
    private Date DatePublication;
    private String description;
    private String ImageCouverture;
    private String fichier;
    private String langue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return Editeur;
    }

    public void setEditeur(String editeur) {
        Editeur = editeur;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    public Date getAnneeEdition() {
        return AnneeEdition;
    }

    public void setAnneeEdition(Date anneeEdition) {
        AnneeEdition = anneeEdition;
    }

    public long getCathegories_Id() {
        return cathegories_Id;
    }

    public void setCathegories_Id(long cathegories_Id) {
        this.cathegories_Id = cathegories_Id;
    }

    public Date getDateSortie() {
        return DateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        DateSortie = dateSortie;
    }

    public Date getDatePublication() {
        return DatePublication;
    }

    public void setDatePublication(Date datePublication) {
        DatePublication = datePublication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageCouverture() {
        return ImageCouverture;
    }

    public void setImageCouverture(String imageCouverture) {
        ImageCouverture = imageCouverture;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    @ManyToOne
    @JoinColumn(name="auteur_id")
    private Auteur auteur;
}
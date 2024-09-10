package com.hasinarezida.biblio.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class LivreRequest {
    public String titre;
    public String editeur;
    public String edition;
    public String description;
    public String imageCouverture;
    public String fichier;
    public String langue;

    @DateTimeFormat(pattern = "yyyy")
    private LocalDate anneeEdition;

    public long cathegoriesId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateSortie;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePublication;

    public LocalDate getAnneeEdition() {
        return anneeEdition;
    }

    public void setAnneeEdition(LocalDate anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }
}

package com.hasinarezida.biblio.controllers;

import com.hasinarezida.biblio.models.Livre;
import com.hasinarezida.biblio.service.livreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/livre")
public class LivreController {

    @Autowired
    private livreService service;

    @PostMapping("/ajout")
    public ResponseEntity<Livre> ajouterLivre(@RequestBody Livre livre) {
        Livre nouveauLivre = service.ajouterLivre(livre);
        return ResponseEntity.ok(nouveauLivre);
    }

    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<Void> supprimerLivre(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/editer/{id}")
    public ResponseEntity<Livre> editerLivre(@PathVariable Long id, @RequestBody Livre livreDetails) {
        Optional<Livre> livreOpt = service.findById(id);
        if (livreOpt.isPresent()) {
            Livre livre = livreOpt.get();
            livre.setTitre(livreDetails.getTitre());
            livre.setAuteur_Id(livreDetails.getAuteur_Id());
            livre.setEditeur(livreDetails.getEditeur());
            livre.setEdition(livreDetails.getEdition());
            livre.setAnneeEdition(livreDetails.getAnneeEdition());
            livre.setCathegories_Id(livreDetails.getCathegories_Id());
            livre.setDateSortie(livreDetails.getDateSortie());
            livre.setDatePublication(livreDetails.getDatePublication());
            livre.setDescription(livreDetails.getDescription());
            livre.setImageCouverture(livreDetails.getImageCouverture());
            livre.setFichier(livreDetails.getFichier());
            livre.setLangue(livreDetails.getLangue());

            Livre editerLivre = service.ajouterLivre(livre);
            return ResponseEntity.ok(editerLivre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/rechercher/{id}")
    public ResponseEntity<Livre> rechercherLivre(@PathVariable Long id) {
        Optional<Livre> livreOpt = service.findById(id);
        return livreOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/filtrer")
    public ResponseEntity<List<Livre>> filtrerLivres(@RequestParam String titre) {
        List<Livre> livres = service.findByNom(titre);
        return ResponseEntity.ok(livres);
    }
}

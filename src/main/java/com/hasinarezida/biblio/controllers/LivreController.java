package com.hasinarezida.biblio.controllers;
import ch.qos.logback.core.model.Model;
import com.hasinarezida.biblio.dto.LivreRequest;
import com.hasinarezida.biblio.models.Auteur;
import com.hasinarezida.biblio.models.Livre;
import com.hasinarezida.biblio.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/livre")
public class LivreController {

    @Autowired
    private LivreService service;

    @PostMapping("/ajout")
    public ResponseEntity<Livre> ajouterLivre(@RequestBody LivreRequest livrerequest) {
        Livre livre = new Livre();
        livre.setTitre(livrerequest.titre);
        livre.setEditeur(livrerequest.editeur);
        livre.setEdition(livrerequest.edition);

        if (livrerequest.getAnneeEdition() != null) {
            livre.setAnneeEdition(Date.valueOf(livrerequest.getAnneeEdition()));
        }

        if (livrerequest.getDatePublication() != null) {
            livre.setDatePublication(Date.valueOf(livrerequest.getDatePublication()));
        }
        livre.setDescription(livrerequest.description);

        if (livrerequest.getDateSortie() != null) {
            livre.setDateSortie(Date.valueOf(livrerequest.getDateSortie()));
        }
        livre.setLangue(livrerequest.langue);
        livre.setFichier(livrerequest.fichier);
        livre.setImageCouverture(livrerequest.imageCouverture);

        Livre nouveauLivre = service.ajouterLivre(livre);
        return ResponseEntity.ok(nouveauLivre);

    }
//    @GetMapping
//    public String afficherLivre(LivreRequest livreRequest){
//        List<Livre> livres = afficherLivre(livreRequest).();
//
//        return "livres";
//    }

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
            return ResponseEntity.ok(new Livre());
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

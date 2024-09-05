package com.hasinarezida.biblio.controllers;

import com.hasinarezida.biblio.models.Auteur;
import com.hasinarezida.biblio.service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auteur")
public class AuteurController {
    @Autowired
    private AuteurService service;

    @PostMapping("/ajout")
    public ResponseEntity<Auteur> ajouterAuteur(@RequestBody Auteur auteur) {
        Auteur nouveauAuteur = service.ajouterAuteur(auteur);
        return ResponseEntity.ok(nouveauAuteur);
    }


    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<Auteur> supprimerAuteur(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/editer/{id}")
    public ResponseEntity<Auteur> editerAuteur(@PathVariable Long id, @RequestBody Auteur auteurDetails) {


        Optional<Auteur> auteurOpt = service.findById(id);
        if (auteurOpt.isPresent()) {
            Auteur auteur = auteurOpt.get();
            auteur.setPseudo(auteurDetails.getPseudo());
            Auteur editerAuteur = service.ajouterAuteur(auteur);
            return ResponseEntity.ok(editerAuteur);
        } else {
            return ResponseEntity.ok(auteurDetails);
        }
    }


    @GetMapping("/rechercher/{id}")

    public ResponseEntity<Auteur> rechercherAuteur(@PathVariable Long id) {
        Optional<Auteur> auteurOpt = service.findById(id);
        return auteurOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/filtrer")
    public ResponseEntity <List<Auteur>>filtrerAuteurs(@RequestParam String pseudo) {
        List<Auteur> auteurs = service.findByNom(pseudo);
        return ResponseEntity.ok(auteurs);
    }
}


package com.hasinarezida.biblio.controllers;

import com.hasinarezida.biblio.dto.RegisterRequest;
import com.hasinarezida.biblio.models.Auteur;
import com.hasinarezida.biblio.service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegisterController {

    @Autowired
    private AuteurService auteurService;

//    @PostMapping
//    public String registerLecteur(@RequestBody Lecteur lecteur) {
//        if (lecteur.getFirst_name() == null || lecteur.getLast_name() == null || lecteur.getEmail() == null) {
//            return " tous les champs sont obligatoires.";
//        }
//
//        if (LecteurService.emailExists(lecteur.getEmail())) {
//            return "Cet email est déjà utilisé, l email est toujours unique.";
//        }
//
//        lecteurservice.saveLecteur(lecteur);
//        return "Enregistrement réussi!";
//    }

    @PostMapping
    public ResponseEntity<String> registerAuteur(@RequestBody RegisterRequest request){

        if(auteurService.existEmail(request.getEmail())){
            return ResponseEntity.badRequest().body("Email already exists");
        }

        Auteur auteur = new Auteur();
        auteur.setEmail(request.getEmail());
        auteur.setPseudo(request.getUsername());
        auteur.setFirst_name(request.getFirst_name());
        auteur.setLastName(request.getLast_name());
        auteur.setGender(request.getGender());

        auteurService.ajouterAuteur(auteur);

        return ResponseEntity.ok().body("Saved successfully");
    }
}

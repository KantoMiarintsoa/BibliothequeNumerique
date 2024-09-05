package com.hasinarezida.biblio.controllers;

import com.hasinarezida.biblio.models.Lecteur;
import com.hasinarezida.biblio.service.LecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegisterController {


    @Autowired
    private LecteurService lecteurservice;

    @PostMapping
    public String registerLecteur(@RequestBody Lecteur lecteur) {
        if (lecteur.getFirst_name() == null || lecteur.getLast_name() == null || lecteur.getEmail() == null) {
            return " tous les champs sont obligatoires.";
        }

        if (LecteurService.emailExists(lecteur.getEmail())) {
            return "Cet email est déjà utilisé, l email est toujours unique.";
        }

        lecteurservice.saveLecteur(lecteur);
        return "Enregistrement réussi!";
    }
}

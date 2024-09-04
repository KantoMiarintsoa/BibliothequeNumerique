package com.hasinarezida.biblio.controllers;

import com.hasinarezida.biblio.dto.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.hasinarezida.biblio.models.Lecteur;
import com.hasinarezida.biblio.repository.LecteurRepository;

import java.util.List;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    private final PasswordEncoder passwordEncoder;
    private LecteurRepository repository;

    @Autowired
    public LoginController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }



    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        List<Lecteur> lecteur = repository.findByUsername(loginRequest.getUsername());

        if (!lecteur.isEmpty() && passwordEncoder.matches(loginRequest.getPassword(), lecteur.getFirst().getPassword())) {
            return ResponseEntity.ok("connnexion avec succes");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("nom d utilisateur ou mot de passe invalide");
        }
    }
}







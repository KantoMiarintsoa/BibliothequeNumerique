//package com.hasinarezida.biblio.controllers;
//
//import com.hasinarezida.biblio.dto.LoginRequest;
//import com.hasinarezida.biblio.models.Auteur;
//import com.hasinarezida.biblio.repository.AuteurRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/api/login")
//public class LoginController {
//
//    private final PasswordEncoder passwordEncoder;
//    private final AuteurRepository repository;
//
//    @Autowired
//    public LoginController(PasswordEncoder passwordEncoder, AuteurRepository repository) {
//        this.passwordEncoder = passwordEncoder;
//        this.repository = repository;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
//        List<Auteur> auteurs = repository.findByUsername(loginRequest.getUsername());
//
//        if (!auteurs.isEmpty() && passwordEncoder.matches(loginRequest.getPassword(), auteurs.get(0).getPassword())) {
//            return ResponseEntity.ok("Connexion avec succès");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nom d'utilisateur ou mot de passe invalide");
//        }
//    }
//}

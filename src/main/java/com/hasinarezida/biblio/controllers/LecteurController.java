//package com.hasinarezida.biblio.controllers;
//
//import com.hasinarezida.biblio.models.Lecteur;
//import com.hasinarezida.biblio.models.Personne;
//import com.hasinarezida.biblio.service.LecteurService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/lecteur")
//public class LecteurController {
//
//    @Autowired
//    private LecteurService service;
//
////    public LecteurController(LecteurService service){
////        this.service=service;
////    }
//
//    @PostMapping("/ajout")
//    public ResponseEntity<Personne> ajouterLecteur(@RequestBody Lecteur lecteur) {
//        Personne nouveauLecteur = service.ajouterLecteur(lecteur);
//        return ResponseEntity.ok(nouveauLecteur);
//    }
//
//    @DeleteMapping("/supprimer/{id}")
//    public ResponseEntity<Void> supprimerLecteur(@PathVariable Long id) {
//        service.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PutMapping("/editer/{id}")
//    public ResponseEntity<Personne> editerLecteur(@PathVariable Long id, @RequestBody Lecteur lecteurDetails) {
//        Optional<Lecteur> lecteurOpt = service.findById(id);
//        if (lecteurOpt.isPresent()) {
//            Lecteur lecteur = lecteurOpt.get();
//            lecteur.setLastName(lecteurDetails.getLastName());
//            lecteur.setFirst_name(lecteurDetails.getFirst_name());
//            lecteur.setEmail(lecteurDetails.getEmail());
//            lecteur.setPhone(lecteurDetails.getPhone());
//
//            Personne editerLecteur = service.ajouterLecteur(lecteur);
//            return ResponseEntity.ok(editerLecteur);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @GetMapping("/rechercher/{id}")
//    public ResponseEntity<Lecteur> rechercherLecteur(@PathVariable Long id) {
//        Optional<Lecteur> lecteurOpt = service.findById(id);
//        return lecteurOpt.map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    @GetMapping("/filtrer")
//    public ResponseEntity<List<Lecteur>> filtrerLecteurs(@RequestParam String nom) {
//        List<Lecteur> lecteurs = service.findByNom(nom);
//        List<Lecteur> lecteur = service.findByNom(nom);
//        return ResponseEntity.ok(lecteurs);
//    }
//}

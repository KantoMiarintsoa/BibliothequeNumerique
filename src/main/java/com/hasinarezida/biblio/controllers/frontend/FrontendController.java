package com.hasinarezida.biblio.controllers.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {
    @GetMapping("/login")
    public String index() {
        return "loginAuteur.html";
    }
    @GetMapping("/register")
    public String register(){
        return "registerAuteur.html";
    }

    @GetMapping("/auteur")
    public String auteur(){
        return "Auteur.html";
    }


    @GetMapping("AuteurPage")
    public String auteurPage(){
        return "AuteurPage.html";
    }

}


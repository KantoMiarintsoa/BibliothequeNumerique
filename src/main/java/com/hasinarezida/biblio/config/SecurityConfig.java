package com.hasinarezida.biblio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorize -> authorize
                        .requestMatchers("/static/**").permitAll() // Permet l'accès aux ressources statiques
                        .anyRequest().permitAll() // Permet l'accès à toutes les pages sans authentification
                );

        return http.build();
    }
}
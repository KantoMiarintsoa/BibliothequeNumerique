package com.hasinarezida.biblio.models;

import jakarta.persistence.*;

import java.util.Date;

@Data
@Entity
@Table(name ="lecteur")
public class Lecteur extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date heureConnex;
    private String username;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getHeureConnex() {
        return heureConnex;
    }

    public void setHeureConnex(Date heureConnex) {
        this.heureConnex = heureConnex;
    }
}

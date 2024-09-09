package com.hasinarezida.biblio.dto;

import jakarta.persistence.Column;

public class RegisterRequest {
    @Column(nullable = false, unique = true)
    public String getUsername() {
        return Username;
    }

    public String getLast_name() {
        return Last_name;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String Username;
    public String Last_name;
    public String First_name;
    public String gender;
    public String Email;
    public String password;
    public String phone;
}



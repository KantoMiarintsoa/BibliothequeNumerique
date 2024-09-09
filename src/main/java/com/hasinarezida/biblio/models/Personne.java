package com.hasinarezida.biblio.models;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "personne")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "dtype")
//@MappedSuperclass
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    @Column(name = "last_name")
    private String LastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate_Creation() {
        return Date_Creation;
    }

    public void setDate_Creation(Date date_Creation) {
        Date_Creation = date_Creation;
    }

    public Date getDate_Update() {
        return Date_Update;
    }

    public void setDate_Update(Date date_Update) {
        Date_Update = date_Update;
    }

    @Column(name = "first_name")
    private String First_name;

    private String gender;

    @Column(name = "email")
    private String email;

    private String password;
    private String phone;

    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date Date_Creation;

    @Column(name = "date_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date Date_Update;

}

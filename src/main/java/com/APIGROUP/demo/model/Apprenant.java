/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.APIGROUP.demo.model;

import com.APIGROUP.demo.Etat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fadiala.sidibe
 */
@Entity
@Table(name="APPRENANT")
public class Apprenant {

    public Apprenant() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @JsonIgnore
    @ManyToMany(mappedBy = "apprenants")
    private List<Groupe> groupes;

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Column(nullable = true)
    private String nom;
    
    @Column(nullable = true)
    private String prenom;
    
    @Column(nullable = true )
    private String email;
    
    @Column(nullable = true)
    private int telephone;
    
    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private Etat etat;

    @ManyToOne
    private Promotion promotion;


    private Boolean supprimer = false;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Boolean getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(Boolean supprimer) {
        this.supprimer = supprimer;
    }
}

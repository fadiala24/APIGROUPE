package com.APIGROUP.demo.model;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "GROUPE")
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private  String name;

    @ManyToMany
    private List<Apprenant> apprenants;

    public Groupe() {
    }

    public List<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(List<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

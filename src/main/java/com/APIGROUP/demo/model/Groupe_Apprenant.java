package com.APIGROUP.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Groupe_Apprenant")
public class Groupe_Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String taches;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "apprenant_id")
    private Apprenant apprenant;

    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;

}

package com.APIGROUP.demo.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "GROUPE")
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private  String name;
    @Column(nullable = false)
    private Date date_creation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public void setName(String name) {
        this.name = name;
    }


}

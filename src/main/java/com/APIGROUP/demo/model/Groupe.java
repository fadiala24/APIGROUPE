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
    private long groupNum;

    public long getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(long groupNum) {
        this.groupNum = groupNum;
    }

    public Groupe(Long id, long groupNum) {
        this.id = id;
        this.groupNum = groupNum;
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

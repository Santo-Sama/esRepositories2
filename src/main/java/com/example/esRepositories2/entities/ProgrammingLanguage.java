package com.example.esRepositories2.entities;

import jakarta.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Integer firstAppearance;

    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(Long id, String name, Integer firstAppearance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(Integer firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
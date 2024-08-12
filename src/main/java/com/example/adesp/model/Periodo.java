package com.example.adesp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "periodo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Disciplina> disciplinas;

    // Getters e Setters
}

package com.example.adesp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String dica;

    @ManyToOne
    @JoinColumn(name = "periodo_id")
    private Periodo periodo;

    @OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Material> materiais;

    // Getters e Setters
}

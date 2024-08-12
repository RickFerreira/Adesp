package com.example.adesp.model;

import javax.persistence.*;

@Entity
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // Ex: "Vídeo", "Slide", "Livro", "Prova", "Documento"
    private String nome;
    private String url; // URL ou caminho para o arquivo

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    // Getters e Setters
}

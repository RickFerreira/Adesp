package com.example.adesp.service;

import com.example.adesp.model.Disciplina;

import java.util.List;

public interface DisciplinaService {
    List<Disciplina> getAllDisciplinas();
    Disciplina getDisciplinaById(Long id);
    void saveDisciplina(Disciplina disciplina);
    void deleteDisciplina(Long id);
}

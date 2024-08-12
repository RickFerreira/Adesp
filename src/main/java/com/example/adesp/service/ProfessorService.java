package com.example.adesp.service;

import com.example.adesp.model.Professor;

import java.util.List;

public interface ProfessorService {
    List<Professor> getAllProfessores();
    Professor getProfessorById(Long id);
    void saveProfessor(Professor professor);
    void deleteProfessor(Long id);
}

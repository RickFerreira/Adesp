package com.example.adesp.service.impl;

import com.example.adesp.model.Disciplina;
import com.example.adesp.repository.DisciplinaRepository;
import com.example.adesp.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Override
    public List<Disciplina> getAllDisciplinas() {
        return disciplinaRepository.findAll();
    }

    @Override
    public Disciplina getDisciplinaById(Long id) {
        return disciplinaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveDisciplina(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }

    @Override
    public void deleteDisciplina(Long id) {
        disciplinaRepository.deleteById(id);
    }
}

package com.example.adesp.controller;

import com.example.adesp.model.Disciplina;
import com.example.adesp.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping("/disciplinas")
    public String listDisciplinas(Model model) {
        model.addAttribute("disciplinas", disciplinaService.getAllDisciplinas());
        return "disciplinas/list";
    }

    @GetMapping("/disciplinas/{id}")
    public String getDisciplina(@PathVariable Long id, Model model) {
        model.addAttribute("disciplina", disciplinaService.getDisciplinaById(id));
        return "disciplinas/detail";
    }

    @PostMapping("/disciplinas")
    public String saveDisciplina(Disciplina disciplina) {
        disciplinaService.saveDisciplina(disciplina);
        return "redirect:/disciplinas";
    }

    @PostMapping("/disciplinas/delete")
    public String deleteDisciplina(@RequestParam Long id) {
        disciplinaService.deleteDisciplina(id);
        return "redirect:/disciplinas";
    }
}

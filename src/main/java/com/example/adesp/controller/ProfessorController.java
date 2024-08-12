package com.example.adesp.controller;

import com.example.adesp.model.Professor;
import com.example.adesp.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping("/professores")
    public String listProfessores(Model model) {
        model.addAttribute("professores", professorService.getAllProfessores());
        return "professores/list";
    }

    @GetMapping("/professores/{id}")
    public String getProfessor(@PathVariable Long id, Model model) {
        model.addAttribute("professor", professorService.getProfessorById(id));
        return "professores/detail";
    }

    @PostMapping("/professores")
    public String saveProfessor(Professor professor) {
        professorService.saveProfessor(professor);
        return "redirect:/professores";
    }

    @PostMapping("/professores/delete")
    public String deleteProfessor(@RequestParam Long id) {
        professorService.deleteProfessor(id);
        return "redirect:/professores";
    }
}

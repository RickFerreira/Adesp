package com.example.adesp.controller;

import com.example.adesp.model.Horario;
import com.example.adesp.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @GetMapping("/horarios")
    public String listHorarios(Model model) {
        model.addAttribute("horarios", horarioService.getAllHorarios());
        return "horarios/list";
    }

    @GetMapping("/horarios/{id}")
    public String getHorario(@PathVariable Long id, Model model) {
        model.addAttribute("horario", horarioService.getHorarioById(id));
        return "horarios/detail";
    }

    @PostMapping("/horarios")
    public String saveHorario(Horario horario) {
        horarioService.saveHorario(horario);
        return "redirect:/horarios";
    }

    @PostMapping("/horarios/delete")
    public String deleteHorario(@RequestParam Long id) {
        horarioService.deleteHorario(id);
        return "redirect:/horarios";
    }
}

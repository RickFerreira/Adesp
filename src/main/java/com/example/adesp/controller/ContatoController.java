package com.example.adesp.controller;

import com.example.adesp.model.Contato;
import com.example.adesp.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping("/contatos")
    public String listContatos(Model model) {
        model.addAttribute("contatos", contatoService.getAllContatos());
        return "contatos/list";
    }

    @GetMapping("/contatos/{id}")
    public String getContato(@PathVariable Long id, Model model) {
        model.addAttribute("contato", contatoService.getContatoById(id));
        return "contatos/detail";
    }

    @PostMapping("/contatos")
    public String saveContato(Contato contato) {
        contatoService.saveContato(contato);
        return "redirect:/contatos";
    }

    @PostMapping("/contatos/delete")
    public String deleteContato(@RequestParam Long id) {
        contatoService.deleteContato(id);
        return "redirect:/contatos";
    }
}

package com.example.adesp.controller;

import com.example.adesp.model.Material;
import com.example.adesp.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("/materiais")
    public String listMateriais(Model model) {
        model.addAttribute("materiais", materialService.getAllMateriais());
        return "materiais/list";
    }

    @GetMapping("/materiais/{id}")
    public String getMaterial(@PathVariable Long id, Model model) {
        model.addAttribute("material", materialService.getMaterialById(id));
        return "materiais/detail";
    }

    @PostMapping("/materiais")
    public String saveMaterial(Material material) {
        materialService.saveMaterial(material);
        return "redirect:/materiais";
    }

    @PostMapping("/materiais/delete")
    public String deleteMaterial(@RequestParam Long id) {
        materialService.deleteMaterial(id);
        return "redirect:/materiais";
    }
}

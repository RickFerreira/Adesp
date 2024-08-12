package com.example.adesp.service.impl;

import com.example.adesp.model.Material;
import com.example.adesp.repository.MaterialRepository;
import com.example.adesp.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public List<Material> getAllMateriais() {
        return materialRepository.findAll();
    }

    @Override
    public Material getMaterialById(Long id) {
        return materialRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMaterial(Material material) {
        materialRepository.save(material);
    }

    @Override
    public void deleteMaterial(Long id) {
        materialRepository.deleteById(id);
    }
}

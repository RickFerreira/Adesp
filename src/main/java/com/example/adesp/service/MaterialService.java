package com.example.adesp.service;

import com.example.adesp.model.Material;
import java.util.List;

public interface MaterialService {
    List<Material> getAllMateriais();
    Material getMaterialById(Long id);
    void saveMaterial(Material material);
    void deleteMaterial(Long id);
}

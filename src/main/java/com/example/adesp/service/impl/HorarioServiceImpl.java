package com.example.adesp.service.impl;

import com.example.adesp.model.Horario;
import com.example.adesp.repository.HorarioRepository;
import com.example.adesp.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioServiceImpl implements HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    @Override
    public List<Horario> getAllHorarios() {
        return horarioRepository.findAll();
    }

    @Override
    public Horario getHorarioById(Long id) {
        return horarioRepository.findById(id).orElse(null);
    }

    @Override
    public void saveHorario(Horario horario) {
        horarioRepository.save(horario);
    }

    @Override
    public void deleteHorario(Long id) {
        horarioRepository.deleteById(id);
    }
}

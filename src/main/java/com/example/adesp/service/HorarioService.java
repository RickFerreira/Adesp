package com.example.adesp.service;

import com.example.adesp.model.Horario;

import java.util.List;

public interface HorarioService {
    List<Horario> getAllHorarios();
    Horario getHorarioById(Long id);
    void saveHorario(Horario horario);
    void deleteHorario(Long id);
}

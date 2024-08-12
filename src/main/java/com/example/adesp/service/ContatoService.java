package com.example.adesp.service;

import com.example.adesp.model.Contato;

import java.util.List;

public interface ContatoService {
    List<Contato> getAllContatos();
    Contato getContatoById(Long id);
    void saveContato(Contato contato);
    void deleteContato(Long id);
}

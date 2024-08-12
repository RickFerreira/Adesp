package com.example.adesp.service.impl;

import com.example.adesp.model.Contato;
import com.example.adesp.repository.ContatoRepository;
import com.example.adesp.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoServiceImpl implements ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    public List<Contato> getAllContatos() {
        return contatoRepository.findAll();
    }

    @Override
    public Contato getContatoById(Long id) {
        return contatoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveContato(Contato contato) {
        contatoRepository.save(contato);
    }

    @Override
    public void deleteContato(Long id) {
        contatoRepository.deleteById(id);
    }
}

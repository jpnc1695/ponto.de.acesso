package com.dio.pontodeacesso.service;

import com.dio.pontodeacesso.model.JornadaTrabalho;
import com.dio.pontodeacesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }


    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }


    public List<JornadaTrabalho> findAll(){
        return  jornadaRepository.findAll();
    }


    public Optional<JornadaTrabalho> findById(Long idJornada){
        return jornadaRepository.findById(idJornada);
    }


    public void delete(Long idJornada){
        jornadaRepository.deleteById(idJornada);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }
}

package com.weslley.apiFoundFootage.service;

import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.entities.Sugestao;
import com.weslley.apiFoundFootage.repository.FilmeRepository;
import com.weslley.apiFoundFootage.repository.SugestaoRepository;
import com.weslley.apiFoundFootage.service.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class SugestaoService {
    @Autowired
    private SugestaoRepository sugestaoRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    public Sugestao save(Sugestao sugestao){
        sugestao.setDataCadastro(Instant.now());
        return sugestaoRepository.save(sugestao);
    }

    public Boolean verificaSugestao(String sugestao){
        List<Filme> filmesEncontrados = filmeRepository.findByNomeContainsIgnoreCase(sugestao);

        if (filmesEncontrados.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public List<Sugestao> findAll(){
        return sugestaoRepository.findAll();
    }

    public Sugestao findById(Long sugestaoID){
        Sugestao sugestao = sugestaoRepository.findById(sugestaoID).orElseThrow(()-> new NotFoundException(sugestaoID));
        return sugestao;
    }




}

package com.weslley.apiFoundFootage.service;

import com.weslley.apiFoundFootage.entities.Categoria;
import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository repository;

    public Filme findById(Long filmeID){
        Optional<Filme> obj = repository.findById(filmeID);
        return obj.get();
    }

    public List<Filme> findAll(){
        return repository.findAll();
    }

    public Filme descobreFilme(List<Long> categoriasIDs){
        List<Filme> filmes = repository.fimesPorCategorias(categoriasIDs);

        int qtdMatch = 0;

        List<Filme> filmesEscolhidos = new ArrayList<>();

        Map<Filme, Long> collect = filmes.stream().collect(Collectors.groupingBy(filme -> filme, Collectors.counting()));
        for (Map.Entry<Filme, Long> f : collect.entrySet()){
            if(qtdMatch <= f.getValue()){
                filmesEscolhidos.add(f.getKey());
                qtdMatch = f.getValue().intValue();

            }
        }
        Collections.shuffle(filmesEscolhidos);
        return filmesEscolhidos.get(0);
    }

    public Filme save(Filme filme){
        return repository.save(filme);
    }

}

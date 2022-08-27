package com.weslley.apiFoundFootage.service;

import com.weslley.apiFoundFootage.entities.Categoria;
import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
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

        Filme filmeEscolhido = new Filme();

        Map<Filme, Long> collect = filmes.stream().collect(Collectors.groupingBy(filme -> filme, Collectors.counting()));
        for (Map.Entry<Filme, Long> f : collect.entrySet()){
            if(qtdMatch < f.getValue()){
                filmeEscolhido = f.getKey();
                qtdMatch = f.getValue().intValue();
            }
        }

        return filmeEscolhido;
    }

}

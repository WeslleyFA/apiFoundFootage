package com.weslley.apiFoundFootage.service;

import com.weslley.apiFoundFootage.entities.Categoria;
import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.repository.CategoriaRepository;
import com.weslley.apiFoundFootage.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;


    public List<Categoria> findAll(){
        return repository.findAll();
    }

    public Categoria save(Categoria categoria){
        return repository.save(categoria);
    }



}

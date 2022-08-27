package com.weslley.apiFoundFootage.service;

import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


}

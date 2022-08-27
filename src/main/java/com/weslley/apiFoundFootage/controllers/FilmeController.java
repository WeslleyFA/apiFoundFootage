package com.weslley.apiFoundFootage.controllers;

import com.weslley.apiFoundFootage.entities.Categoria;
import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/filme")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    private ResponseEntity<List<Filme>> findAll(){
        List<Filme> filmes = filmeService.findAll();
        return ResponseEntity.ok().body(filmes);
    }

    @PostMapping("/filtra")
    private ResponseEntity<List<Filme>> descobreFilme(@RequestBody List<Long> categoriasIDs){
        List<Filme> filmes = filmeService.descobreFilme(categoriasIDs);
        return ResponseEntity.ok().body(filmes);
    }
}

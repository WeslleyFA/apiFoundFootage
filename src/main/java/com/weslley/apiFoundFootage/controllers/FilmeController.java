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
@CrossOrigin("*")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    private ResponseEntity<List<Filme>> findAll(){
        List<Filme> filmes = filmeService.findAll();
        return ResponseEntity.ok().body(filmes);
    }

    @GetMapping("/{filmeID}")
    private ResponseEntity<Filme> findById(@PathVariable Long filmeID){
        Filme filme = filmeService.findById(filmeID);
        return ResponseEntity.ok().body(filme);
    }

    @PostMapping("/recomenda")
    private ResponseEntity<Long> descobreFilme(@RequestBody List<Long> categoriasIDs){

        Filme filme = filmeService.descobreFilme(categoriasIDs);
        return ResponseEntity.ok().body(filme.getFilmeID());
    }

    @PostMapping()
    private ResponseEntity<Filme> saveFilme(@RequestBody Filme filme){
        Filme novoFilme = filmeService.save(filme);
        return ResponseEntity.ok().body(novoFilme);
    }
}

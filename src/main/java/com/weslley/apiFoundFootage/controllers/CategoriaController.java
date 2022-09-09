package com.weslley.apiFoundFootage.controllers;

import com.weslley.apiFoundFootage.entities.Categoria;
import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.service.CategoriaService;
import com.weslley.apiFoundFootage.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
@CrossOrigin("*")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    private ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> categorias = categoriaService.findAll();
        return ResponseEntity.ok().body(categorias);
    }

    @PostMapping
    private ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
        Categoria novaCategoria = categoriaService.save(categoria);
        return ResponseEntity.ok().body(novaCategoria);
    }
}

package com.weslley.apiFoundFootage.controllers;

import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.entities.Sugestao;
import com.weslley.apiFoundFootage.service.FilmeService;
import com.weslley.apiFoundFootage.service.SugestaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sugestao")
@CrossOrigin("*")
public class SugestaoController {

    @Autowired
    private SugestaoService sugestaoService;

    @GetMapping
    private ResponseEntity<List<Sugestao>> findAll(){
        List<Sugestao> sugestoes = sugestaoService.findAll();
        return ResponseEntity.ok().body(sugestoes);
    }

    @GetMapping("/{sugestaoID}")
    private ResponseEntity<Sugestao> findById(@PathVariable Long sugestaoID){
        Sugestao sugestao = sugestaoService.findById(sugestaoID);
        return ResponseEntity.ok().body(sugestao);
    }

    @PostMapping("/verifica")
    private ResponseEntity<Boolean> verificaSugestao(@RequestBody String sugestao){
        Boolean existe = sugestaoService.verificaSugestao(sugestao);
        return ResponseEntity.ok().body(existe);
    }

    @PostMapping()
    private ResponseEntity<Sugestao> saveFilme(@RequestBody Sugestao sugestao){
        Sugestao novaSugestao = sugestaoService.save(sugestao);
        return ResponseEntity.ok().body(novaSugestao);
    }



}

package com.weslley.apiFoundFootage.config;

import com.weslley.apiFoundFootage.entities.Categoria;
import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.repository.CategoriaRepository;
import com.weslley.apiFoundFootage.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class ConfiguracaoTest implements CommandLineRunner {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria c1 = new Categoria(null, "Macabro");
        Categoria c2 = new Categoria(null, "Assassino em Série");

        categoriaRepository.saveAll(Arrays.asList(c1,c2));

        Filme filme = new Filme(null, "Teste", "Desc teste", "Teste");

        filme.getCategorias().addAll(Arrays.asList(c1,c2));
        filmeRepository.save(filme);
    }






}

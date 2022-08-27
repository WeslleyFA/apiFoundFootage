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

        Categoria c1 = new Categoria(null, "Perdidos na Selva");
        Categoria c2 = new Categoria(null, "Documentário Falso");
        Categoria c3 = new Categoria(null, "Exploração de Lugar Abandonado");
        Categoria c4 = new Categoria(null, "Manicômio");
        Categoria c5 = new Categoria(null, "Monstro");

        categoriaRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5));

        Filme f1 = new Filme(null, "Fenômenos Paranormais", "Desc teste", "Teste");
        Filme f2 = new Filme(null, "A Bruxa de Blair", "Desc teste", "Teste");
        Filme f3 = new Filme(null, "Lake Mungo", "Desc teste", "Teste");

        f1.getCategorias().addAll(Arrays.asList(c2,c3,c4));
        f2.getCategorias().addAll(Arrays.asList(c1,c2));
        f3.getCategorias().addAll(Arrays.asList(c2));

        filmeRepository.saveAll(Arrays.asList(f1,f2,f3));
    }






}

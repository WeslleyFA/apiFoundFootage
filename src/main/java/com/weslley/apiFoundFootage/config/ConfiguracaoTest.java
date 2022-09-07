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
        Categoria c4 = new Categoria(null, "Manicômio/Hospital");
        Categoria c5 = new Categoria(null, "Monstro");
        Categoria c6 = new Categoria(null, "Aparição");
        Categoria c7 = new Categoria(null, "Agonia");
        Categoria c8 = new Categoria(null, "Sensação ruim");

        Categoria c9 = new Categoria(null, "Invasão de Privacidade");
        Categoria c10 = new Categoria(null, "Poderes");
        Categoria c11= new Categoria(null, "Socorro, Aliens!");
        Categoria c12 = new Categoria(null, "Stalker");
        Categoria c13= new Categoria(null, "Claustrofóbico");
        Categoria c14 = new Categoria(null, "Internet Envolvida");
        Categoria c15 = new Categoria(null, "Que tenha um psicopata");
        Categoria c16 = new Categoria(null, " Maldição/Magia Negra");

        categoriaRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8, c9,c10,c11,c12,c13,c14,c15,c16));

        Filme f1 = new Filme(null, "Fenômenos Paranormais", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://images.justwatch.com/poster/182996677/s718/fenomenos-paranormais.%7Bformat%7D");
        Filme f2 = new Filme(null, "A Bruxa de Blair", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://br.web.img2.acsta.net/medias/nmedia/18/93/98/96/20293294.jpg");
        Filme f3 = new Filme(null, "Lake Mungo", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://media.fstatic.com/CU33B2d5hlQXtDNMQcAuT63zkrI=/290x478/smart/media/movies/covers/2016/06/lake-mungo_t14749.jpg");

        Filme f4 = new Filme(null, "Projeto X", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://media.fstatic.com/s4rR1ScdcyhsPObhvFM2dfbhQi8=/210x312/smart/media/movies/covers/2012/01/c584817a3f3ff3ca88317829ea987aa9.jpg");
        Filme f5 = new Filme(null, "Contatos de 4° grau", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://upload.wikimedia.org/wikipedia/pt/a/aa/The_Fourth_Kind.jpg");
        Filme f6 = new Filme(null, "Hangman", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://media.fstatic.com/iGQd4ptbhdXDfo62pBcl7TUIZMM=/210x312/smart/media/movies/covers/2016/01/hangman_t192667.jpg");
        Filme f7 = new Filme(null, "The Den", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-P7_R9DeyiVYOfR7TmaOR_VXKlyne41jp2E_91sdnyfFGY5dAWwgYfvfUbrL7Aux-4p0&usqp=CAU");
        Filme f8 = new Filme(null, "Megan is Missing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://upload.wikimedia.org/wikipedia/pt/4/43/Megan_is_Missing.jpg");
        Filme f9 = new Filme(null, "Poder sem Limites!", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "https://media.fstatic.com/U1SsCkA6KFhKLYh8TCUeTFP5MsQ=/290x478/smart/media/movies/covers/2012/01/bde6788795560f20e17b9be7cafaafb3.jpg");

        f1.getCategorias().addAll(Arrays.asList(c2,c3,c4, c6,c13));
        f2.getCategorias().addAll(Arrays.asList(c1,c2, c3));
        f3.getCategorias().addAll(Arrays.asList(c2, c6, c7, c8));

        f5.getCategorias().addAll(Arrays.asList(c11, c2, c8));
        f6.getCategorias().addAll(Arrays.asList(c7,c9,c12, c15));
        f7.getCategorias().addAll(Arrays.asList(c7,c8,c9,c14));
        f8.getCategorias().addAll(Arrays.asList(c2,c7,c8,c12,c14,c15));
        f9.getCategorias().addAll(Arrays.asList(c10,c3));

        filmeRepository.saveAll(Arrays.asList(f1,f2,f3,f4,f5,f6,f7,f8,f9));
    }






}

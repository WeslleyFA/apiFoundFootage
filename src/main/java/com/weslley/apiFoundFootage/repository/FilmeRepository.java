package com.weslley.apiFoundFootage.repository;

import com.weslley.apiFoundFootage.entities.Categoria;
import com.weslley.apiFoundFootage.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    @Query(
            value = "select distinct f from Filme f join f.categorias c where c.categoriaID in (?1)"
    )
    public List<Filme> fimesPorCategorias(List<Long> categoriasIDs);
}

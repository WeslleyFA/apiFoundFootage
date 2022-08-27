package com.weslley.apiFoundFootage.repository;

import com.weslley.apiFoundFootage.entities.Categoria;
import com.weslley.apiFoundFootage.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

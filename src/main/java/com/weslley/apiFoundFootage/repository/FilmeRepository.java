package com.weslley.apiFoundFootage.repository;

import com.weslley.apiFoundFootage.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}

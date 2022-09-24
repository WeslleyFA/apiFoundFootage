package com.weslley.apiFoundFootage.repository;

import com.weslley.apiFoundFootage.entities.Filme;
import com.weslley.apiFoundFootage.entities.Sugestao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SugestaoRepository extends JpaRepository<Sugestao, Long> {

}

package com.weslley.apiFoundFootage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaID;
    private String descricao;

    @JsonIgnore
    @ManyToMany(mappedBy = "categorias")
    private Set<Filme> filmes = new HashSet<>();
    public Categoria() {
    }

    public Categoria(Long categoriaID, String descricao) {
        this.categoriaID = categoriaID;
        this.descricao = descricao;
    }

    public Long getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(Long categoriaID) {
        this.categoriaID = categoriaID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Filme> getFilmes() {
        return filmes;
    }
}

package com.weslley.apiFoundFootage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmeID;
    private String nome;
    private String sinopse;
    private String imgUrl;

    @ManyToMany
    @JoinTable(name = "Filme_Categorias")
    private Set<Categoria> categorias = new HashSet<>();

    public Filme() {
    }

    public Filme(Long filmeID, String nome, String sinopse, String imgUrl) {
        this.filmeID = filmeID;
        this.nome = nome;
        this.sinopse = sinopse;
        this.imgUrl = imgUrl;
    }

    public Long getFilmeID() {
        return filmeID;
    }

    public void setFilmeID(Long filmeID) {
        this.filmeID = filmeID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    public Set<Categoria> getCategorias() {
        return categorias;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "filmeID=" + filmeID +
                ", nome='" + nome + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", categorias=" + categorias +
                '}';
    }
}

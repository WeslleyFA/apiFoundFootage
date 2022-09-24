package com.weslley.apiFoundFootage.entities;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Sugestao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long sugestaoID;
    private String nomeFilme;
    private Instant dataCadastro;

    @Column(length = 500)
    private String descricao;
    private String sugeridoPor;
    private Boolean aprovado = false;

    @ManyToMany
    @JoinTable(name = "Sugestao_Categorias")
    private Set<Categoria> categorias = new HashSet<>();

    public Long getSugestaoID() {
        return sugestaoID;
    }

    public void setSugestaoID(Long sugestaoID) {
        this.sugestaoID = sugestaoID;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSugeridoPor() {
        return sugeridoPor;
    }

    public void setSugeridoPor(String sugeridoPor) {
        this.sugeridoPor = sugeridoPor;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public Instant getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Instant dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}

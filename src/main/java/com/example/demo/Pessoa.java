package com.example.demo;

import java.time.LocalDate;

public class Pessoa {
    private long id;
    private final String nome;
    private final LocalDate aniversario;
    private final String favorito;
    
    public Pessoa(long id,String nome, LocalDate aniversario, String favorito){
        this.id =id;
        this.nome = nome;
        this. aniversario = aniversario;
        this.favorito = favorito;
    }
    
    public long getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public LocalDate getAniversario(){
        return this.aniversario;
    }

    public String getFavorito(){
        return this.favorito;
    }
}

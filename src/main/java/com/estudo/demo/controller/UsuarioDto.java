package com.estudo.demo.controller;

import java.io.Serializable;

public class UsuarioDto implements Serializable {
   String nome;
   String idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}

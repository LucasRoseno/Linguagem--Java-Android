package com.example.prj_compartilha;

public class Compartilha {
    private static String nome;
    public void setNome(String v){
        nome = v;
    }

    public static String getNome() {
        return nome;
    }

    // public ---> todas as telas podem ter acesso a ela
    // static ---> quando eu uso ele, serve para usar em mais de uma tela, ele que complartilhar

}

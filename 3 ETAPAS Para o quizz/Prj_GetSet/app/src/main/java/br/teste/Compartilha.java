package br.teste;

public class Compartilha {

    public Compartilha(){ //metodo contrutor que estava escondido



    }
    public Compartilha(Integer n){ //metodo com uma assiantura
        texto = n.toString();


    }


    private static String texto; //propriedade
    public void setTexto(String v){
        texto = v;
    }



    public String getTexto(){
        return texto;
    }

}

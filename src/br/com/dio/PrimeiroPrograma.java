package br.com.dio;

import model.Gato;
import model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        System.out.println("Hello World");
        System.out.println("vai rolar");

        Livro l = new Livro("Codigo da vinci", 30);
        System.out.println(l);
    }
}

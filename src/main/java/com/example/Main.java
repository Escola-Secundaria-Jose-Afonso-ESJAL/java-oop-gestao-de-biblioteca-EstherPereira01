package com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro l2 = new Livro( "Duna", "Frank Herbert", 1965);
        Livro l3 = new Livro("O Senhor dos Anéis","J.R.R. Tolkien",1954);
        
        
        ArrayList<Livro> livros = new ArrayList<Livro>();
        
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        
        b1.listarLivros();
        
        b1.removerLivro("Duna");
    }
}

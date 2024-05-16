package model;

import java.util.ArrayList;
import java.util.List;

public class Funcoes {
    
    private List<Livro> livros = new ArrayList<>();
    private int currentId = 1;

    public List<Livro> listarLivros() {
        return livros;
    }

    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor, currentId++);
        livros.add(livro);
    }

    public Livro getLivroByTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro getLivroByAutor(String autor) {
        for (Livro livro : livros) {
            if (livro.getAutor().equals(autor)) {
                return livro;
            }
        }
        return null;
    }
}

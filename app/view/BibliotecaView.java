package view;

import model.Livro;

import java.util.List;
import java.util.Scanner;

public class BibliotecaView {
    
    private final Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\nBem-vindo à Biblioteca");
        System.out.println("");

        System.out.println("1. Buscar livro");
        System.out.println("2. Solicitar empréstimo");
        System.out.println("3. Devolver livro emprestado");     
        System.out.println("4. Listar livros");
        System.out.println("5. Adicionar livro (Somente para administradores)");
        System.out.println("6. Sair");
        System.out.print("\nEscolha uma opção: ");
        

        return scanner.nextInt();
    }

    public String capturarTituloLivro() {
        scanner.nextLine(); 
        System.out.print("\nDigite o título/autor do livro: ");
        return scanner.nextLine();
    }

    public String capturarAutorLivro() {
        System.out.print("\nDigite o autor do livro: ");
        return scanner.nextLine();
    }

    public void mostrarLivros(List<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("\nNenhum livro disponível.");
        } else {
            System.out.println("\nLista de Livros:\n");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}

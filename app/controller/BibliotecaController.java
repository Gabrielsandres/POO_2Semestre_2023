package controller;

import model.Funcoes;
import model.Livro;
import view.BibliotecaView;

public class BibliotecaController {
    
    private final Funcoes funcoes;
    private final BibliotecaView bibliotecaView;

    public BibliotecaController(Funcoes funcoes, BibliotecaView bibliotecaView) {
        this.funcoes = funcoes;
        this.bibliotecaView = bibliotecaView;
    }

    public void iniciar() {
        boolean executando = true;
        while (executando) {
            int opcao = bibliotecaView.mostrarMenu();
            switch (opcao) {
                case 1:
                    buscarLivro();
                    break;
                case 2:
                    solicitarEmprestimo();
                    break;
                case 3:
                    devolverLivro();
                    break;
                case 4:
                    listarLivros();
                    break;
                case 5:
                    adicionarLivro();
                    break;
                case 6:
                    System.out.println("\nPrograma encerrado!\n");
                    executando = false;
                    break;
                default:
                    bibliotecaView.mostrarMensagem("\nOpção inválida.");
            }
        }
    }

    private void buscarLivro() {
        String tituloOuAutor = bibliotecaView.capturarTituloLivro();
        Livro livro = funcoes.getLivroByTitulo(tituloOuAutor);
        if (livro == null) {
            livro = funcoes.getLivroByAutor(tituloOuAutor);
        }
        if (livro != null) {
            bibliotecaView.mostrarMensagem("\nLivro encontrado: " + livro);
        } else {
            bibliotecaView.mostrarMensagem("\nLivro não encontrado.");
        }
    }

    private void solicitarEmprestimo() {
        String titulo = bibliotecaView.capturarTituloLivro();
        Livro livro = funcoes.getLivroByTitulo(titulo);
        if (livro != null && !livro.isEmprestado()) {
            // Marcar o livro como emprestado
            livro.setEmprestado(true);
            // Registrar o empréstimo do livro
            // (Você pode implementar uma classe Empréstimo para registrar detalhes do empréstimo)
            bibliotecaView.mostrarMensagem("\nLivro emprestado com sucesso.");
        } else {
            bibliotecaView.mostrarMensagem("\nLivro não encontrado ou já emprestado.");
        }
    }
    
    private void devolverLivro() {
        String titulo = bibliotecaView.capturarTituloLivro();
        Livro livro = funcoes.getLivroByTitulo(titulo);
        if (livro != null && livro.isEmprestado()) {
            // Marcar o livro como disponível
            livro.setEmprestado(false);
            // Registrar a devolução do livro
            // (Você pode implementar uma classe Devolução para registrar detalhes da devolução)
            bibliotecaView.mostrarMensagem("\nLivro devolvido com sucesso.");
        } else {
            bibliotecaView.mostrarMensagem("\nLivro não encontrado ou não emprestado.");
        }
    }
    

    private void listarLivros() {
        bibliotecaView.mostrarLivros(funcoes.listarLivros());
    }

    private void adicionarLivro() {
        String titulo = bibliotecaView.capturarTituloLivro();
        String autor = bibliotecaView.capturarAutorLivro();
        funcoes.adicionarLivro(titulo, autor);
    }
}

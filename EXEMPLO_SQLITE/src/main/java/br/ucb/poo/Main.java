package br.ucb.poo;

import br.ucb.poo.dao.PessoaDAO;
import br.ucb.poo.model.Pessoa;

public class Main {

    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa("Jota", "jota@gmail.com");
       
       PessoaDAO dao = new PessoaDAO();

       dao.salvarPessoa(pessoa);
    }
}

/*Sistema de gerenciamento de livros.
 * 
 * Crie um sistema simples de gerenciamento de livros usando objetos e classes.
 * Cada livro deve ter informações como título, autor e ano de publicação.
 * 
 */

package livraria;

import java.util.Scanner;

public class sistema {

    

    public static void main(String[] args) {
        int opcao = 0;
        Livraria livraria = new Livraria();

        Scanner scanner = new Scanner(System.in);

        while(opcao != 4){
            System.out.println("1- Adicionar o livro");
            System.out.println("2- Listar livros");
            System.out.println("3- Detalhar livro");
            System.out.println("4- Sair");
            opcao = scanner.nextInt();
            executarOpcao(opcao, scanner, livraria);
        }
        scanner.close();
        System.out.println("\nSistema fechado!");
    }

    public  static void executarOpcao(int op, Scanner sc, Livraria livraria){

        switch (op) {
            case 1:
                System.out.println("Adicionando livro");
                System.out.println("Digite o ID: ");
                int id = sc.nextInt();
                System.out.println("Digite o Autor: ");
                String autor = sc.nextLine();
                System.out.println("Digite o titulo: ");
                String titulo = sc.nextLine();
                System.out.println("Digite o ano de publicação: ");
                String anoDePublicacao = sc.nextLine();
                Livro l = new Livro(id, autor, titulo, anoDePublicacao);
                livraria.adicionarLivro(l);

                break;
            case 2:
                System.out.println("Listando livros");
                System.out.println(livraria.listarLivros());
                break;
            case 3:
                System.out.println("Detalhando livro");
                System.out.println("Buscar livro por id:");
                
                break;
            case 4:
                System.out.println("\nSaindo...");
                break;
        
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}

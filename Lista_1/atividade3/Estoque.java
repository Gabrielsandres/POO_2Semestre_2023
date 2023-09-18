package Lista_1.atividade3;

/*Crie um sistema simples de gerenciamento de estoque usando objetos e classes. Cada objeto do estoque deve ter nome e quantidade.
O sistema deve permitir ao usuário adicionar, remover, listar e atualizar a quantidade de objetos cadastrados.*/

import java.util.Scanner;

public class Estoque {

    static class Produto {

        String nome;
        int quant;

        public Produto(String nome, int quant) {
            this.nome = nome;
            this.quant = quant;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] estoque = new Produto[100];

        int opcao = -1;
        
        while (opcao != 5) {

            System.out.println("\n--------------------------------------------------------------------\n");
            System.out.println("Sistema gerenciador de estoque!\n");
            System.out.println("1- Adicionar\t2- Remover\t3- Listar\t4- Atualizar\t5- Finalizar programa");
            System.out.print("\nDigite a opção desejada, de acordo com as funções acima: ");
            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            
                
                switch (opcao) {

                case 1:
                    System.out.print("\nDigite o nome do produto: ");
                    String nomeProduto = scanner.next();
                    scanner.nextLine();
                    System.out.print("\nDigite a quantidade do produto: ");
                    int quantProduto = scanner.nextInt();

                    Produto novoProduto = new Produto(nomeProduto, quantProduto);

                    int posicaoVazia = -1;

                    for (int i = 0; i < estoque.length; i++) {

                        if (estoque[i] == null) {
                            posicaoVazia = i;
                            break;
                        }
                    }

                    if (posicaoVazia == -1) {
                        System.out.println("\nEstoque cheio, não foi possível adicionar item!\n");
                    } else {
                        estoque[posicaoVazia] = novoProduto;
                        System.out.println("\nProduto adicionado com sucesso!\n");
                    }

                    break;

                case 2:

                    System.out.print("\nDigite o nome do produto que deseja remover:");
                    String nameProduct = scanner.nextLine();
                    System.out.print("\nDigite a quantidade do produto que deseja remover:");
                    int numberProduct = scanner.nextInt();

                    for (int i = 0; i < estoque.length; i++) {

                        if (estoque[i] != null && estoque[i].nome.equals(nameProduct)) {
                            if (estoque[i].quant >= numberProduct) {
                                estoque[i].quant -= numberProduct;
                            } else {
                                System.out.println("Número de estoque insuficiente para retirada!");
                            }

                            System.out.println("\nProduto retirado!\n");
                        }
                    }

                    break;

                case 3:
                
                    for (int i = 0; i < estoque.length; i++) {
                        if (estoque[i] != null) {
                        System.out.println( "\n" + (i + 1) + "- Produto: " + estoque[i].nome + ", Quantidade: " + estoque[i].quant);
                    }
                }

                    break;

                case 4:

                    System.out.print("\nDigite o nomedo produto que deseja atualizar:");
                    String nameProduct2 = scanner.nextLine();
                    System.out.print("\nDigite a nova quantidade do produto:");
                    int numberProduct2 = scanner.nextInt();

                    for (int i = 0; i < estoque.length; i++) {

                        if (estoque[i] != null && estoque[i].nome.equals(nameProduct2)) {
                            
                            estoque[i].quant = numberProduct2;

                            System.out.println("\nProduto atualizado!\n");
                        }
                    }

                    break;

                case 5:
                    
                    System.out.println("\nPrograma finalizado!\n");

                    break;
                    default:
                        System.out.println("Opção inválida. Digite um número correspondente a uma opção válida.");
                        break;
                }
            } else {
                String entradaInvalida = scanner.next();
                System.out.println("Entrada inválida. \"" + entradaInvalida + "\" não é uma opção válida.");
            }

            } 
            scanner.close();
        }
        
    }
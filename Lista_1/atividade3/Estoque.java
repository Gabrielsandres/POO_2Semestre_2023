/*Crie um sistema simples de gerenciamento de estoque usando objetos e classes. Cada objeto do estoque deve ter nome e quantidade.
O sistema deve permitir ao usuário adicionar, remover, listar e atualizar a quantidade de objetos cadastrados.*/

package POO_2Semestre_2023.Lista_1.atividade3;
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

        System.out.println("Sistema gerenciador de estoque!\n");
        System.out.println("1- Adicionar\t2- Remover\t3- Listar\t4- Atualizar a quantidade de objetos cadastrados\t5- Finalizar programa.");
        System.out.println("Digite a opção desejada, de acordo com as funções acima: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do produto: ");
                String nomeProduto = scanner.next();
                System.out.println("Digite a quantidade do produto: ");
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
                    System.out.println("Estoque cheio, não foi possível adicionar item!");
                }else{
                    estoque[posicaoVazia] = novoProduto;
                    System.out.println("Produto adicionado com sucesso!");
                }

                break;

            case 2:
                
                break;

            case 3:
                
                break;

            case 4:
                
                break;

            case 5:
                
                break;
        
            default:
                break;
        }

        scanner.close();
    }
}

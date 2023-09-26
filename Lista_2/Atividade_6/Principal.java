package Lista_2.Atividade_6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        
        //Apartamento
        Apartamento a1 = new Apartamento("123 Rua Principal", 2, 5);
        Apartamento a2 = new Apartamento("407 Rua João Cabral", 3, 10);
        Apartamento a3 = new Apartamento("107 Avenida Castanheiras", 4, 15);
        
        //Casa
        Casa c1 = new Casa("SHA CHA 45 CASA 55", 4, true);
        Casa c2 = new Casa("SMPW 05 CHA 47", 3, false);
        Casa c3 = new Casa("QE 28 CONJ X CASA 25", 2, true);
        
        //Sobrado
        Sobrado s1 = new Sobrado("QI 65 CONJ S CASA 23", 5, 2, true);
        Sobrado s2 = new Sobrado("SMPW 27 CHA 34", 3, 2, false);
        Sobrado s3 = new Sobrado("SHA CHA 78 CASA 33", 6, 3, true);

        while (true) { 
            System.out.println("\n\n1- Apartamento, 2- Casa ou 3- Sobrado, 4- Sair");
            System.out.print("Digite a opção de moradia que você deseja visualizar: ");
            userInput = scanner.nextLine();
            
            switch (userInput) {
                case "1":
                    a1.descricao();
                    a2.descricao();
                    a3.descricao(); 
                    break;
                case "2":
                    c1.descricao();
                    c2.descricao();
                    c3.descricao();
                    break;
                case "3":
                    s1.descricao();       
                    s2.descricao();  
                    s3.descricao();
                    break;
                case "4":
                    System.out.println("\nPrograma finalizado!");
                    scanner.close();
                    System.exit(0); 
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente");
                    break;
            }
        }
    }
}





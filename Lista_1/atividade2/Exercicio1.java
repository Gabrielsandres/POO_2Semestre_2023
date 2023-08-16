package Lista_1.atividade2;
import java.util.Scanner;

/*Calculadora Simples - Crie um programa Java que funcione como uma calculadora simples. Peça ao usuário para inserir dois números e uma operação
 (+, -, *, /). Realize a operação escolhida e exiba o resultado. */



public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

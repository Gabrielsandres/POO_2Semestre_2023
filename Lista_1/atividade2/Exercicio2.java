package Lista_1.atividade2;
import java.util.Scanner;
import java.text.DecimalFormat;

/*Conversor de Temperatura Crie um conversor de temperatura que permita ao usuário converter entre Celsius e Fahrenheit. Peça ao usuário para escolher
 a direção da conversão e, em seguida, faça a conversão e exiba o resultado. */

public class Exercicio2 {

    public static void main(String[] args){

        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("(1 - Celsius p/ Fahrenheit ou 2 - Fahrenheit p/ Celsius)");
        System.out.print("Escolha a ordem de conversão: ");
        i = scanner.nextInt();

        while (i != 1 && i != 2){

            System.out.println("\nOpção inválida!");
            System.out.println("(1 - Celsius p/ Fahrenheit ou 2 - Fahrenheit p/ Celsius)");
            System.out.print("Digite novamente: ");
            i = scanner.nextInt();

        }
        
        System.out.print("\nDigite a temperatura que deseja realizar a conversão: ");
        double temperatura = scanner.nextDouble();

        double calculo = 0;
        

        switch(i){
            case 1: 
                calculo = (temperatura * 1.8) + 32;
                String numeroFormatadoCelsius = formatarNumero(calculo, "#.##");
                System.out.println("\n" + temperatura + "° Celsius equivale a: " + numeroFormatadoCelsius + "° Fahrenheit");
                break;
            case 2:
                calculo = (temperatura - 32) * 0.5555555555555556;
                String numeroFormatadoFahrenheit = formatarNumero(calculo, "#.##");
                System.out.println("\n" + temperatura + "° Fahrenheit equivale a: " + numeroFormatadoFahrenheit + "° Celsius");
                break;  
        } 

        scanner.close();
    }

    public static String formatarNumero(double calculo, String padrao) {
        
        DecimalFormat formato = new DecimalFormat(padrao);
        return formato.format(calculo);
    }
}

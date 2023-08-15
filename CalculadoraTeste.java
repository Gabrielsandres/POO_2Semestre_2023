package teste;

import revisao.Calculadora;

public class CalculadoraTeste {
    
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        /*Calculadora calc2 = new Calculadora();*/

        calc.a = 3;
        calc.b = 5;
        calc.operador = "-";
        System.out.println(calc.operar());

       /* calc2.a = 4;
        calc2.b = 6;
        System.out.println(calc2.somar());*/
    }
}

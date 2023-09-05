package teste;

import revisao.Calculadora2;

public class CalculadoraTeste2 {
    public static void main(String[] args){

        Calculadora2 calc = new Calculadora2();

        calc.setA(12);
        calc.setB(10);
        try{
            calc.setOperador("+");
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(calc.operar2());
    }
}

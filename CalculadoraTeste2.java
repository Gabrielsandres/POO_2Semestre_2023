package teste;

import revisao.Calculadora2;

public class CalculadoraTeste2 {
    public static void main(String[] args){

        Calculadora2 calc = new Calculadora2();

        calc.setA(a:3);
        calc.setB(a:5);
        try{
            calc.setOeprador(op:"+");
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(calc.operar());
    }
}

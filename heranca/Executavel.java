package heranca;

import heranca.empresa.Diretor;
import heranca.empresa.Engenheiro;
import heranca.empresa.Gerente;
import heranca.empresa.Funcionario;;

public class Executavel {
    
    public static void main(String[] args) {
        
        //ENGENHEIROS
        Engenheiro eng1 = new Engenheiro("Jota", 123, 61999, 001, "POO 1");
        Engenheiro eng2 = new Engenheiro("Pedro", 456, 62987, 002, "POO 2");

        //GERENTES
        Gerente g1 = new Gerente("João", 999, 61123, 2);

        //DIRETORES
        Diretor d1 = new Diretor("Carlos", 563, 85735, 1);

        
        //IMPRIMI ENGENHEIROS
        System.out.println("Engenheiro 1:" + eng1);
        System.out.println("Engenheiro 2:" + eng2);

        //IMPRIMI ENGENHEIROS
        System.out.println("Gerente 1:" + g1);

        //IMPRIMI DIRETORES
        System.out.println("Diretor 1:" + d1);

        imprimirFuncionario(g1);
    }

    public static void imprimirFuncionario(Funcionario f){
        System.out.println(f);
    }
}

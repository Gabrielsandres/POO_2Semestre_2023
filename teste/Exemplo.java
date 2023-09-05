package teste;

/*Exemplo do uso de do "this" */

public class Exemplo {
    private int numero;

    public Exemplo(int numero) {
        this.numero = numero; // Usando 'this' para acessar o atributo de instância
    }

    public void exibirNumero() {
        System.out.println("Número: " + this.numero); // Usando 'this' para acessar o atributo
    }

    public void fazerAlgo() {
        int numero = 42;
        System.out.println("Número local: " + numero); // Variável local
        System.out.println("Número de instância: " + this.numero); // Atributo de instância usando 'this'
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo(10);
        exemplo.exibirNumero();
        exemplo.fazerAlgo();
    }
}


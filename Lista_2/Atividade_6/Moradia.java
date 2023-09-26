package Lista_2.Atividade_6;

public class Moradia {
    private String endereco;
    private int numeroQuartos;

    public Moradia(String endereco, int numeroQuartos) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void descricao() {
        System.out.println("Esta é uma moradia.");
    }
}


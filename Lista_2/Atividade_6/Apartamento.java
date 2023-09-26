package Lista_2.Atividade_6;

public class Apartamento extends Moradia {
    private int andar;

    public Apartamento(String endereco, int numeroQuartos, int andar) {
        super(endereco, numeroQuartos);
        this.andar = andar;
    }

    public int getAndar() {
        return andar;
    }

    @Override
    public void descricao() {
        System.out.println("Este é um apartamento localizado em " + getEndereco() + " no " + andar + "º andar, com " + getNumeroQuartos() + " quartos.");
    }
}



package Lista_2.Atividade_6;


public class Sobrado extends Moradia {
    private int numAndares;
    private boolean temPiscina;

    public Sobrado(String endereco, int numeroQuartos, int numAndares, boolean temPiscina) {
        super(endereco, numeroQuartos);
        this.numAndares = numAndares;
        this.temPiscina = temPiscina;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public boolean temJardim() {
        return temPiscina;
    }

    @Override
    public void descricao() {
        String possuiJardim = temPiscina ? "com piscina" : "sem piscina";
        System.out.println("Este é um sobrado localizado em " + getEndereco() + " com " + getNumeroQuartos() + " quartos, " + numAndares + " andares e " + possuiJardim + ".");
    }
}


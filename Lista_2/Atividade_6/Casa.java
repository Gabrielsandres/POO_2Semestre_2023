package Lista_2.Atividade_6;

public class Casa extends Moradia {
    private boolean jardim;

    public Casa(String endereco, int numeroQuartos, boolean jardim) {
        super(endereco, numeroQuartos);
        this.jardim = jardim;
    }

    public boolean temJardim() {
        return jardim;
    }

    @Override
    public void descricao() {
        String possuiJardim = jardim ? "com jardim" : "sem jardim";
        System.out.println("Esta é uma casa localizada em " + getEndereco() + " com " + getNumeroQuartos() + " quartos e " + possuiJardim + ".");
    }
}



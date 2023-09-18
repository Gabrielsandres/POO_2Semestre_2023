package Lista_2.Atividade_5;

public class Carro extends Veiculo {

    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int anoFabricacao, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, anoFabricacao);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Métodos específicos para Carro
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }


    @Override
    public String toString() {
    return super.toString() + "Número de Portas: " + numeroPortas + "\tTipo de Combustível: " + tipoCombustivel + " }\n";
}



}


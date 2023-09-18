package Lista_2.Atividade_5;

public class Bicicleta extends Veiculo {
    private int numeroMarchas;
    private String tipoFreio;

    public Bicicleta(String marca, String modelo, int anoFabricacao, int numeroMarchas, String tipoFreio) {
        super(marca, modelo, anoFabricacao);
        this.numeroMarchas = numeroMarchas;
        this.tipoFreio = tipoFreio;
    }

    // Métodos específicos para Bicicleta
    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }


    @Override
    public String toString() {
    return super.toString() + "Número de marchas: " + numeroMarchas + "\tTipo do freio: " + tipoFreio + " }\n";
}



}


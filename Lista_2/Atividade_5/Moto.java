package Lista_2.Atividade_5;

public class Moto extends Veiculo {

    private String tipoMotor;
    private int cilindrada;

    public Moto(String marca, String modelo, int anoFabricacao, String tipoMotor, int cilindrada) {
        super(marca, modelo, anoFabricacao);
        this.tipoMotor = tipoMotor;
        this.cilindrada = cilindrada;
    }

    // Métodos específicos para Moto
    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
    return super.toString() + "Tipo do motor: " + tipoMotor + "\tCilindrada: " + cilindrada + " }\n";
}

}



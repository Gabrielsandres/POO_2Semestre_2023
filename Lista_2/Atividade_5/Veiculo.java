package Lista_2.Atividade_5;

public class Veiculo {
    
    protected String marca;
    protected String modelo;
    protected Integer AnoFabricacao;

    public Veiculo(String marca, String modelo, Integer AnoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.AnoFabricacao = AnoFabricacao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return this.AnoFabricacao;
    }

    public void setAnoFabricacao(Integer AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }


    @Override
    public String toString() {
        return "{" +
            " marca: " + getMarca() + " " +
            " modelo: " + getModelo() + " " +
            " AnoFabricacao: " + getAnoFabricacao() + " ";
    }
    
}

    

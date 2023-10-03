package polimorfismo.mercado;

public abstract class Produto {
    
    protected String nome;
    protected Double preco;

    public Produto (String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String ImprimirNotaFiscal() {
        return this.nome + " - R$ " + this.preco;
    }

    public Double calcularValorTotal(){
        return this.preco;
    }
}

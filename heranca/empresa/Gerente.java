package heranca.empresa;

public class Gerente extends Funcionario{
    
    
    protected Integer quantidadeGerenciados;



    public Gerente(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
    }
    

    public Integer getQuantidadeGerenciados() {
        return this.quantidadeGerenciados;
    }

    public void setQuantidadeGerenciados(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
    }

    public Double getSalario(){
        return 15000.00;
    }

    public Double getBonificacao(){
        return getSalario() * 0.25;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerenciados() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificação='" + getBonificacao() + "'" +
            "}";
    }


}

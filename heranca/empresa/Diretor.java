package heranca.empresa;

public class Diretor extends Funcionario{
    
    
    protected Integer quantidadeGerencias;



    public Diretor(String nome, Integer cpf, Integer telefone, Integer quantidadeGerencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.quantidadeGerencias = quantidadeGerencias;
    }
    

    public Integer getQuantidadeGerencias() {
        return this.quantidadeGerencias;
    }

    public void setQuantidadeGerencias(Integer quantidadeGerencias) {
        this.quantidadeGerencias = quantidadeGerencias;
    }

    @Override
    public Double getSalario(){
        return 40000.00;
    }

    @Override
    public Double getBonificacao(){
        return getSalario() * 0.45;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantidadeGerencias='" + getQuantidadeGerencias() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificação='" + getBonificacao() + "'" +
            "}";
    }

}

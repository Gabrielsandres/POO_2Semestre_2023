package heranca.empresa;

public class Engenheiro extends Funcionario {
    
    
    protected Integer crea;
    protected String projeto;


    public Engenheiro(Integer crea, String projeto) {
        this.crea = crea;
        this.projeto = projeto;
    }

    
    public Integer getCrea() {
        return this.crea;
    }

    public void setCrea(Integer crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    
    @Override
    public Double getSalario(){
        return 10000.00;
    }

    @Override
    public Double getBonificacao(){
        return getSalario() * 0.15;
    }


    @Override //Para sobreescrever
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificação='" + getBonificacao() + "'" +
            "}";
    }


}

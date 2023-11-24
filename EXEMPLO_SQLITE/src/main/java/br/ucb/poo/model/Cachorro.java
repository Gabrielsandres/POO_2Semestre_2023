package br.ucb.poo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cachorro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String raca;
    private Integer idade;
    private String cor;

    
    public Cachorro(){

    }

    public Cachorro(Integer id, String nome, String raca, Integer idade, String cor) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
    }

    public Cachorro(String nome, String raca, Integer idade, String cor) {

        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", raca='" + getRaca() + "'" +
            ", idade='" + getIdade() + "'" +
            ", cor='" + getCor() + "'" +
            "}";
    }






    
}

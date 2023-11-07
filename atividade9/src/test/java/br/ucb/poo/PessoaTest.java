package test.java.br.ucb.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.br.ucb.poo.Pessoa;

public class PessoaTest {
    
    public Pessoa pessoa;

    @BeforeEach
    public void setup(){
        this.pessoa = new Pessoa();
    }

    @Test
    public void dizerOlaTest(){
        assertEquals("Olá, maven!", pessoa.dizerOla());
    }

}

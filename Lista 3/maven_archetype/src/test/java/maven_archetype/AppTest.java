package maven_archetype;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PessoaTest {
    @Test
    public void testDizerOla() {
        Pessoa pessoa = new Pessoa();
        String saudacao = pessoa.dizerOla();
        assertEquals("Olá, mundo!", saudacao);
    }
}

package revisao;

public class Calculadora {

    public Integer a;
    public Integer b;
    public String operador;

    public Integer operar() {
        
        if (operador.equals("+")) {
            return this.a + this.b;
        } else if (operador.equals("-")) {
            return this.a - this.b;
        } else if (operador.equals("*")) {
            return this.a * this.b;
        } else{
            return this.a / this.b;
        }
            
    }
}


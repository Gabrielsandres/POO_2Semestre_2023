package revisao;

public class Calculadora2 {
    
    private Integer a;
    private Integer b;
    private String operador;

    public Integer getA(){
        return this.a;
    }

    public void setA(Integer a){
        this.a = a;
    }

    public Integer getB(){
        return this.b;
    }

    public void setB(Integer b){
        this.b = b;
    }

    public String getOperador(){
        return this.operador;
    }

    public void setOperador(String op) throws Exception {
        switch (op) {
            case "+":
            case "-":
            case "*":
            case "/":
                this.operador = op;
                break;
            default:
                throw new Exception("Operador inválido");
        }
    }
    
    public Integer operar2(){
        Integer ret = 0;
        switch (this.operador) {
            case "+":
                ret = this.a + this.b;
                break;
            case "-":
                ret = this.a - this.b;
                break;
            case "*":
                ret = this.a * this.b;
                break;
            case "/":
                ret = this.a / this.b;
                break;
        }
        return ret;
    }
}

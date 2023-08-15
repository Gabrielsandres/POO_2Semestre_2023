package revisao;

public class VerificaNumeroPrimo {

    public Integer n;

    public Integer verificaNumero() {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0; // Não é primo
            }
        }
        return 1; // É primo
    }

    public static void main(String[] args) {
        VerificaNumeroPrimo verifica = new VerificaNumeroPrimo();
        verifica.n = 20; // O número que você deseja verificar
        Integer resultado = verifica.verificaNumero();
        System.out.println(resultado);
    }
}

package polimorfismo;

import polimorfismo.mercado.Alho;
import polimorfismo.mercado.CarrinhoDeCompra;

public class Executavel {

    public static void main(String[] args) {
        
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        Alho a1 = new Alho("Alho comum", 1.99, 1.0);

        carrinho.adicionarProduto(a1);

        System.out.println("Valor total: " + carrinho.finalizarCompra());
    }


    
}

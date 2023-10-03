package polimorfismo.mercado;

import java.util.ArrayList;

public class CarrinhoDeCompra {
    
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompra(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        this.produtos.add(p);
    }

    public String finalizarCompra(){
        String notaFiscal = "";
        Double valorTotal = 0.0;

        for (Produto p :produtos){
            valorTotal += p.calcularValorTotal();
            notaFiscal += p.ImprimirNotaFiscal() + "\n";
        }

        return notaFiscal + "\n\nValor total: " + valorTotal;
    }

    



}

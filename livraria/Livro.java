package livraria;

public class Livro {
    int id;
    String autor;
    String titulo;
    String anoDePublicacao;

    public Livro(int id, String autor, String titulo, String anoDePublicacao){
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String imprimir(){
        String retorno = "";
        retorno = this.id + " - " + this.titulo + " - " + this.autor + " - " + this.anoDePublicacao;
        return retorno;
    }
}

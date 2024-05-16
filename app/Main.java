import controller.BibliotecaController;
import model.Funcoes;
import view.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        BibliotecaView bibliotecaView = new BibliotecaView();
        BibliotecaController bibliotecaController = new BibliotecaController(funcoes, bibliotecaView);

        bibliotecaController.iniciar();
    }
}


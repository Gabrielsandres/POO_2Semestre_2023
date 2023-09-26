package Lista_2.Atividade_6;



public class Principal {
    public static void main(String[] args) {
        Apartamento apartamento = new Apartamento("123 Rua Principal", 2, 5);
        Casa casa = new Casa("456 Avenida Secundária", 3, true);
        Sobrado sobrado = new Sobrado("789 Rua da Esquina", 4, 2, false);

        apartamento.descricao(); 
        casa.descricao();       
        sobrado.descricao();      
    }
}




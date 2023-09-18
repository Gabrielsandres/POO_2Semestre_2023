package Lista_2.Atividade_5;

public class Executavel {

    public static void main(String[] args) {
        
        // Carros
        Carro c1 = new Carro("Fiat", "Argo", 2020, 4, "Gasolina");
        Carro c2 = new Carro("Fiat", "Toro", 2017, 3, "Diesel");
        Carro c3 = new Carro("Honda","Civic", 2023, 4, "Gasolina");
        
        // Motos
        Moto m1 = new Moto("Honda", "Ninja", 2007, "Gasolina", 700);
        Moto m2 = new Moto("Yamaha", "Fazer", 2015, "Gasolina", 600);
        Moto m3 = new Moto("Harley", "Iron", 2023, "Gasolina", 883);

        // Bicicletas
        Bicicleta b1 = new Bicicleta("Audax", "400", 2018, 9, "Disco");
        Bicicleta b2 = new Bicicleta("Caloi", "BMX", 2021, 0, "Aro");
        Bicicleta b3 = new Bicicleta("Tesla",  "Master Blaster", 2023, 12, "Hidráulico");

        imprimirVeiculo(c1);
        imprimirVeiculo(c2);
        imprimirVeiculo(c3);
        imprimirVeiculo(m1);
        imprimirVeiculo(m2);
        imprimirVeiculo(m3);
        imprimirVeiculo(b1);
        imprimirVeiculo(b2);
        imprimirVeiculo(b3);
        
        acelerar(c1);
        freiar(c2);
    }

    public static void imprimirVeiculo(Veiculo x) {
        System.out.println(x);
    }

    public static void acelerar(Veiculo veiculo){
        System.out.println("O veículo "+ veiculo.getMarca() + " " + veiculo.getModelo() + " acelerou!");
    }

    public static void freiar(Veiculo veiculo){
        System.out.println("O veículo "+ veiculo.getMarca() + " " + veiculo.getModelo() + " freiou!");
    }
}

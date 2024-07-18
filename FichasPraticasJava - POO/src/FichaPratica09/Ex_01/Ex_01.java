package FichaPratica09.Ex_01;
import FichaPratica08.Ex_05.Carro;

public class Ex_01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fiat", "Uno", 1990, 45, "GASOLINA", 5.9, 903);
        Carro carro2 = new Carro("Peugeot", "404", 1974, 94, "DIESEL", 10.5, 1948);
        Carro carro3 = new Carro("Seat", "Ibiza", 2022, 95, "GASOLINA", 4.7, 1198);
        Carro carro4 = new Carro("Faísca", "McQueen", 2006, 1001, "GASOLINA", 24.1, 8000);

        carro4.corrida(carro1);
        carro1.consumoKm(carro2, 97);
    }
}

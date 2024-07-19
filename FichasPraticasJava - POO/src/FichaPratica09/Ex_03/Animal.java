package FichaPratica09.Ex_03;

public class Animal {

    private String nome;
    private String especie;
    private String paisOrigem;
    private double pesoKg;
    private Alimentos[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double pesoKg, Alimentos[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoKg = pesoKg;
        this.alimentacao = alimentacao;
    }

    public double pesoAnimal(){
        return pesoKg;
    }

    public boolean comer(String alimento, double pesoAlimento) {
        for (int i = 0; i < alimentacao.length; i++) {
            if(alimentacao[i].name().equalsIgnoreCase(alimento)){
                this.pesoKg += pesoAlimento / 100;
                return true;
            }
        }
        return false;
    }
}
package FichaPratica10.Ex_03;

public class Peixe {

    private String especie;
    private double peso;
    private double precoKg;

    /**
     *
     * @param especie Espécie do peixe
     * @param peso Peso do peixe
     * @param precoKg Preco por Kg do peixe
     */
    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public void exibirDetalhes(){
        System.out.println("Espécie: " + this.especie + " | " + this.peso + " | " + this.precoKg);
    }
}

package FichaPratica11.AirplaneStore;

public class Aviao {

    protected String numSerie;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double compFosulagem;
    private double envAsas;
    private double altCauda;
    private int nMotores;
    private double autonomia;
    private double velMax;
    private double preco;

    public Aviao(String numSerie, String modelo, int anoFabrico, double peso, double compFosulagem, double envAsas, double altCauda, int nMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFosulagem = compFosulagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.nMotores = nMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Número de Série: "+this.numSerie);
        System.out.println("Ano de Fabrico: "+this.anoFabrico);
        System.out.println("Número de Motores: "+this.nMotores);
        System.out.println("Comp. Fuselagem: "+this.compFosulagem);
        System.out.println("Env. Asas: "+this.envAsas);
        System.out.println("Altura Cauda: "+this.altCauda);
        System.out.println("Peso: "+this.peso);
        System.out.println("Velocidade Máxima: "+this.velMax);
        System.out.println("Preço: "+this.preco+"€");
    }
}
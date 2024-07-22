package FichaPratica10.Ex_03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCargaKg;
    private double capacidadeAtualKg;
    ArrayList<Peixe> peixesPescados;
    ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCargaKg) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.capacidadeAtualKg = 0;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public void pescarPeixe(String peixeNovo, double pesoNovo, double precoKgNovo, int quantidadePeixe){
        Peixe peixe = new Peixe(peixeNovo, pesoNovo, precoKgNovo);
        for (int i = 0; i < quantidadePeixe; i++) {
            this.peixesPescados.add(peixe);
            this.capacidadeAtualKg += peixe.getPeso();
        }
    }

    public void pescarMarisco(String mariscoNovo, double pesoNovo, double precoKgNovo){
        Marisco marisco = new Marisco(mariscoNovo, pesoNovo, precoKgNovo);
        this.mariscoPescado.add(marisco);
    }

    public void exibirDetalhes(){
        for (int i = 0; i < this.peixesPescados.size(); i++) {
            System.out.println(this.peixesPescados.get(i));
        }
    }
}
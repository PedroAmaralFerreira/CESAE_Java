package FichaPratica10.Ex_03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCargaKg;
    private Marca marcaBarco;
    private double capacidadeAtualKg;
    ArrayList<Peixe> peixesPescados;
    ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, Marca marcaBarco, double capacidadeCargaKg) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.marcaBarco = marcaBarco;
        this.capacidadeAtualKg = 0;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public double calcularCargaAtual(){
        double cargaAtual = 0;

        for (Peixe peixeAtual: this.peixesPescados){
            cargaAtual += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual: this.mariscoPescado){
            cargaAtual += mariscoAtual.getPeso();
        }

        return cargaAtual;
    }

    public void addPeixe(Peixe peixeNovo){
        if(this.calcularCargaAtual() + peixeNovo.getPeso() <= this.capacidadeCargaKg){
            this.peixesPescados.add(peixeNovo);
        }
    }

    public void addMarisco(Marisco mariscoNovo){
        if(this.calcularCargaAtual() + mariscoNovo.getPeso() <= this.capacidadeCargaKg){
            this.mariscoPescado.add(mariscoNovo);
        }
    }

    public void exibirDetalhes(){
        System.out.println("***** " + this.nome + " *****");
        System.out.println("Carga Atual: " + this.calcularCargaAtual() + " Kg.\n");
        System.out.println("Peixe Pescado: ");
        for (Peixe peixeAtual: this.peixesPescados){
            peixeAtual.exibirDetalhes();
        }
        System.out.println();

        System.out.println("Marisco Pescado: ");
        for (Marisco mariscoAtual: this.mariscoPescado){
            mariscoAtual.exibirDetalhes();
        }
        System.out.println("\nValor Total da Carga: " + this.valorTotal()+ "€");
    }

    public double valorTotal(){
        double valorTotal = 0;

        for (Peixe peixeAtual: this.peixesPescados){
            valorTotal += peixeAtual.getPeso() * peixeAtual.getPrecoKg();
        }

        for (Marisco mariscoAtual: this.mariscoPescado){
            valorTotal += mariscoAtual.getPeso() * mariscoAtual.getPrecoKg();
        }

        return valorTotal;
    }
}
package FichaPratica11.AirplaneStore;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> listaAvioes;

    public Catalogo(){
        this.listaAvioes = new ArrayList<Aviao>();
    }

    public void comprarAviao(Aviao aviaoNovo){
        this.listaAvioes.add(aviaoNovo);
    }

    public void venderAviao(Aviao aviaoVendido){
        this.listaAvioes.remove(aviaoVendido);
    }

    public void exibirCatalogo(){
        for (Aviao aviaoAtual: this.listaAvioes){
            System.out.println("\n**********\n");
            aviaoAtual.exibirDetalhes();
        }
    }
}
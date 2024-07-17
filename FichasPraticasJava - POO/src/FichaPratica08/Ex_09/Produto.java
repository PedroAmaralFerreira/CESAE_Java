package FichaPratica08.Ex_09;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeStock=0;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar(int quantidadeCompra){
        this.quantidadeStock += quantidadeCompra;
    }

    public void vender(int quantidadeVenda){
        if (this.quantidadeStock >= quantidadeVenda){
            this.quantidadeStock -= quantidadeVenda;
        } else {
            System.out.println("Fora de Stock!");
        }
    }

    public void exibirDetalhes(){
        System.out.println("\nProduto: "+this.nome);
        System.out.println("Preço: "+this.preco);
        System.out.println("Quantidade Stock: "+this.quantidadeStock);
        System.out.println();
        System.out.println("_________________________");
    }

}

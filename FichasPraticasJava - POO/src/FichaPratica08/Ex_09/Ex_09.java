package FichaPratica08.Ex_09;

public class Ex_09 {
    public static void main(String[] args) {

        Produto caneta = new Produto("Caneta - BIC", 1);
        caneta.exibirDetalhes();

        caneta.comprar(5);

        caneta.exibirDetalhes();

        caneta.vender(2);

        caneta.exibirDetalhes();

        caneta.vender(5);

    }
}

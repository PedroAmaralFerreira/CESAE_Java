package FichaPratica09.Ex_04;

public class Ex_04 {
    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("Rua Marcelo Rebelo de Sousa", 40, "Lisboa", TipoCasa.MANSAO, Acabamento.NOVA_ALTO, 4000, 4, 4, 15);
        Imovel imovel2 = new Imovel("Rua Cristiano Ronaldo", 7, "Madeira", TipoCasa.MANSAO, Acabamento.NOVA_ALTO, 8000, 7, 7, 40);

        // Valor do imovel (Mansao)
        System.out.print("Valor Total: ");
        System.out.printf("%.2f",imovel1.calcularImovel());
        System.out.println("€");

        // Alterar acabamento
        imovel1.mudarAcabamento(Acabamento.NOVA);

        // Valor do imovel (Mansao) ATUALIZADO
        System.out.print("(ATUALIZADO) Valor Total: ");
        System.out.printf("%.2f",imovel1.calcularImovel());
        System.out.println("€");

        // Apresentar Descricao do imovel
        imovel1.imprimirDescricao();

        System.out.println();

        // Comparar e apresentar imovel mais caro
        System.out.println(imovel1.compararImoveis(imovel2)+" é o mais caro");
    }
}

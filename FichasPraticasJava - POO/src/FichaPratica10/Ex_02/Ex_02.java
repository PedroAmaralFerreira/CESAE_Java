package FichaPratica10.Ex_02;

public class Ex_02 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Pedro Ferreira", 23, "911 222 333", "pedroferreira@gmail.com");
        Pessoa pessoa2 = new Pessoa("Cristiano Ronaldo", 39, "922 222 433", "cr7siii@gmail.com");


        Sorteio cabazNatal = new Sorteio(5000);

        cabazNatal.addParticipante(pessoa1);
        cabazNatal.addParticipante(pessoa2);

        cabazNatal.exibirDetalhes();

        System.out.println("\n***** Vencedor *****");
        cabazNatal.sortear().exibirDetalhes();
    }
}

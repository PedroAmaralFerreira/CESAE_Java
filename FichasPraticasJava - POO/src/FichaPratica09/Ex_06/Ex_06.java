package FichaPratica09.Ex_06;

public class Ex_06 {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Cristiano Ronaldo","Futebol",1.85,70,"Portugal");
        Atleta atleta2 = new Atleta("Connor Mc.", "Luta", 1.76, 78, "Irlanda");

        Competicao maratonaPorto = new Competicao("Maratona Porto", "Portugal");
        maratonaPorto.addAtleta(atleta1);
        maratonaPorto.addAtleta(atleta2);

        Competicao jogosOlimpicos = new Competicao("Jogos Olímpicos", "França");
        jogosOlimpicos.addAtleta(atleta1);
        jogosOlimpicos.addAtleta(atleta2);

        maratonaPorto.exibirDetalhes();
        jogosOlimpicos.exibirDetalhes();

    }
}

package FichaPratica08.Ex_07;

public class Ex_07 {
    public static void main(String[] args) {

        Livro livro1 = new Livro("A Rapariga no Comboio", "Paula Hawkins","Policial", 320, "9789898800541");
        Livro livro2 = new Livro("A Criada Está a Ver", "Freida McFadden","Policial", 360, "9789895702756");


        livro1.exigirDetalhes();
        System.out.println();
        livro2.exigirDetalhes();

    }
}

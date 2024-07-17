package FichaPratica08.Ex_01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void dadosPessoa(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.altura);
    }
}

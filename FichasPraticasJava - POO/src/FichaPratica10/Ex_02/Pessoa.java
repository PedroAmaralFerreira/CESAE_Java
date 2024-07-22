package FichaPratica10.Ex_02;

public class Pessoa {

    private String nome;
    private int idade;
    private String telemovel;
    private String email;

    public Pessoa(String nome, int idade, String telemovel, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telemovel = telemovel;
        this.email = email;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Telemóvel: "+this.telemovel);
        System.out.println("Email: "+this.email);
    }
}

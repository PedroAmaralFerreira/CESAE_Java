package FichaPratica08.Ex_10;

public class Funcionario {

    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double valorPercentual){
        this.salario += (valorPercentual / 100)  * this.salario;
    }

    public void exibirDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Salário: "+ this.salario);
        System.out.println("Departamento: "+ this.departamento);
        System.out.println();
    }

}

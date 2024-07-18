package FichaPratica08.Ex_10;

public class Ex_10 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Pedro Ferreira", 1800, "Back-End Developer");

        funcionario.exibirDados();

        funcionario.aumentarSalario(10);

        funcionario.exibirDados();

    }
}

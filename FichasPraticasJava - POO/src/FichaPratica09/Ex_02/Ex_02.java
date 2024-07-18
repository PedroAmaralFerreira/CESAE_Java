package FichaPratica09.Ex_02;
import FichaPratica08.Ex_11.Conta;


public class Ex_02 {
    public static void main(String[] args) {

        Conta conta = new Conta("2234", 1000, "João Coimbra", 2023, 90, 0);

        conta.mostrarSaldo();
        System.out.println();

        if(conta.pedirEmprestimo(900)){
            System.out.println("Empréstimo Aprovado!");
            conta.mostrarSaldo();
        } else {
            System.out.println("Empréstimo Recusado!");
        }

    }
}

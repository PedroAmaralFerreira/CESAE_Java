package FichaPratica08.Ex_11;

public class Conta {

    private String numConta;
    private double saldo;
    private String titularConta;
    private int anoAbertura;
    private double margemEmprestimo;
    private double valorEmDivida;

    public Conta(String numConta, double saldo, String titularConta, int anoAbertura, double margemEmprestimo, double valorEmDivida){
        this.numConta = numConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
        this.anoAbertura = anoAbertura;
        this.margemEmprestimo = margemEmprestimo;
        this.valorEmDivida = valorEmDivida;
    }

    public void transferencia(double valorTransferencia, Conta contaDestinario){
        this.saldo -= valorTransferencia;
        contaDestinario.depositar(valorTransferencia);
    }

    public void depositar(double dinheiroDeposito){
        this.saldo += dinheiroDeposito;
    }

    public void levantar(double dinheiroLevantar){
        if (this.saldo - dinheiroLevantar >= 0){
            this.saldo -= dinheiroLevantar;
        } else {
            System.out.println("Saldo insuficiente para levantar!");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo da conta "+this.numConta+": "+this.saldo+"€");
    }

    public boolean pedirEmprestimo(double emprestimoPedido){

        double valorPosEmprestimo = this.saldo - emprestimoPedido * (this.margemEmprestimo / 100);

        if (this.valorEmDivida != 0){
            return false;
        }
        if (valorPosEmprestimo >= 0){
            this.saldo -= emprestimoPedido;
            return true;
        } else {
            return false;
        }
    }
}

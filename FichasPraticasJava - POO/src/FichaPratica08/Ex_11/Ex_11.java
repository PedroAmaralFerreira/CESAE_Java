package FichaPratica08.Ex_11;

public class Ex_11 {
    public static void main(String[] args) {

        Conta conta1 = new Conta("1234", 1000, "José Marques", 2015, 50, 800);
        Conta conta2 = new Conta("1249", 5000, "José António", 2018, 24, 1000);
        Conta conta3 = new Conta("1270", 500, "José Miguel", 2000, 5, 100);

        conta1.mostrarSaldo();
        conta1.depositar(1000);
        conta1.mostrarSaldo();
        conta1.levantar(120);
        conta1.mostrarSaldo();

        conta2.transferencia(300, conta3);
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();

    }
}

package FichaPratica02;
import java.util.Scanner;
public class Ex_13 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int hora, minuto;

        // Ler Hora e Minuto
        System.out.println("Introduza horas: ");
        hora = input.nextInt();
        System.out.println("Introduza minutos: ");
        minuto = input.nextInt();

        //Apresentar o horário
        if(hora <= 12 && minuto < 10)
            System.out.println(hora + ":0" + minuto +" AM");
        if(hora <= 12 && minuto > 10)
            System.out.println(hora + ":" + minuto +" AM");
        if(hora > 12 && minuto < 10)
            System.out.println(hora + ":0" + minuto +" PM");
        if(hora > 12 && minuto > 10)
            System.out.println(hora + ":" + minuto +" PM");
    }
}

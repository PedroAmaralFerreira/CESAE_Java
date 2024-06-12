package FichaPratica01;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        // Importar Dados
        Scanner input = new Scanner(System.in);

        // Ler minutos e segundos da música
        System.out.print("Introduza minutos da música 1: ");
        int min1 = input.nextInt();
        System.out.print("Introduza segundos da música 1: ");
        int seg1 = input.nextInt();
        System.out.print("Introduza minutos da música 2: ");
        int min2 = input.nextInt();
        System.out.print("Introduza segundos da música 2: ");
        int seg2 = input.nextInt();
        System.out.print("Introduza minutos da música 3: ");
        int min3 = input.nextInt();
        System.out.print("Introduza segundos da música 3: ");
        int seg3 = input.nextInt();
        System.out.print("Introduza minutos da música 4: ");
        int min4 = input.nextInt();
        System.out.print("Introduza segundos da música 4: ");
        int seg4 = input.nextInt();
        System.out.print("Introduza minutos da música 5: ");
        int min5 = input.nextInt();
        System.out.print("Introduza segundos da música 5: ");
        int seg5 = input.nextInt();

        // Calcular duração total do álbum
        int horaTotal = ((60 * min1 + seg1) + (60 * min2 + seg2) + (60 * min3 + seg3) + (60 * min4 + seg4) +(60 * min5 + seg5)) / 3600;
        int minTotal = ((60 * min1 + seg1) + (60 * min2 + seg2) + (60 * min3 + seg3) + (60 * min4 + seg4) +(60 * min5 + seg5)) / 60;
        int segundos = ((60 * min1 + seg1) + (60 * min2 + seg2) + (60 * min3 + seg3) + (60 * min4 + seg4) +(60 * min5 + seg5));
        int segTotal = segundos % 60;

                // Duração total do álbum e músicas
        System.out.println("Música 1: "+min1+"m "+seg1+"s");
        System.out.println("Música 2: "+min2+"m "+seg2+"s");
        System.out.println("Música 3: "+min3+"m "+seg3+"s");
        System.out.println("Música 4: "+min4+"m "+seg4+"s");
        System.out.println("Música 5: "+min5+"m "+seg5+"s");
        System.out.println("");
        System.out.println("Total do Álbum: "+ horaTotal + "h " +minTotal + "m " + segTotal +"s");

    }
}

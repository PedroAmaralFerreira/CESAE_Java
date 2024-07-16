package Utilidades;

import java.util.Scanner;

public class PressEnterToContinue {
    public static void pressEnterToContinue(){
        System.out.print("Insira qualquer tecla ou pressione ENTER para continuar: ");
        try{
            System.in.read();
        }
        catch (Exception e){
        }
        System.out.println();
    }
}

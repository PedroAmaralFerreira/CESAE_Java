package Utilidades;

import java.util.Scanner;

public class PressionaEnter {
    public static void pressionaEnter(){
        System.out.print("Pressiona ENTER para continuar...");
        try{
            System.in.read();
        }
        catch (Exception e){
        }
        System.out.println();
    }
}

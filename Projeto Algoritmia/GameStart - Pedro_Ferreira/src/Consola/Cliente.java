package Consola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cliente {
    public static void idCliente(String path) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));

        if(scannerFicheiro.hasNextLine()){
            scannerFicheiro.nextLine();
        }

        while (scannerFicheiro.hasNextLine()){
            String linha = scannerFicheiro.nextLine();

            String[] linhaDividida = linha.split(";");
            int idCliente = Integer.parseInt(linhaDividida[0]);
            String nomeCliente = linhaDividida[1];
            int numeroCliente = Integer.parseInt(linhaDividida[2]);
            String emailCliente = linhaDividida[3];
            System.out.println("ID Cliente: "+idCliente);
            System.out.println("Nome Cliente: "+nomeCliente);
            System.out.println("Contacto: "+numeroCliente);
            System.out.println("Email: "+emailCliente);
            System.out.println();
        }
    }
}

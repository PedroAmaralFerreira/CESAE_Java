package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImprimirCatalogo {
    public static void imprimirCatalogo() throws FileNotFoundException{

        // Introduzir scanner
        Scanner scanner = new Scanner(System.in);

        // Escolher jogo
        System.out.println("1. Call Of Duty\n2. FIFA\n3. Hollow Knight\n4. Minecraft\n5. Mortal Kombat\n6. Overcooked\n7. Witcher III\nSeleciona um jogo: ");
        int opcao = scanner.nextInt();

        // Apresentar o design grafico do jogo
        switch (opcao){
            case 1:
                Scanner scannerCOD = new Scanner(new File("GameStart/CatalogoGrafico/callOfDuty.txt"));
                while (scannerCOD.hasNextLine()){
                    System.out.println(scannerCOD.nextLine());
                }
                break;
            case 2:
                Scanner scannerFIFA = new Scanner(new File("GameStart/CatalogoGrafico/fifa.txt"));
                while (scannerFIFA.hasNextLine()){
                    System.out.println(scannerFIFA.nextLine());
                }
                break;
            case 3:
                Scanner scannerHK = new Scanner(new File("GameStart/CatalogoGrafico/hollowKnight.txt"));
                while (scannerHK.hasNextLine()){
                    System.out.println(scannerHK.nextLine());
                }
                break;
            case 4:
                Scanner scannerMinecraft = new Scanner(new File("GameStart/CatalogoGrafico/minecraft.txt"));
                while (scannerMinecraft.hasNextLine()){
                    System.out.println(scannerMinecraft.nextLine());
                }
                break;
            case 5:
                Scanner scannerMK = new Scanner(new File("GameStart/CatalogoGrafico/mortalKombat.txt"));
                while (scannerMK.hasNextLine()){
                    System.out.println(scannerMK.nextLine());
                }
                break;
            case 6:
                Scanner scannerOC = new Scanner(new File("GameStart/CatalogoGrafico/overcooked.txt"));
                while (scannerOC.hasNextLine()){
                    System.out.println(scannerOC.nextLine());
                }
                break;
            case 7:
                Scanner scannerWitcher = new Scanner(new File("GameStart/CatalogoGrafico/witcher3.txt"));
                while (scannerWitcher.hasNextLine()){
                    System.out.println(scannerWitcher.nextLine());
                }
                break;
        }
    }
}

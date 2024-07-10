package Consola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Admin {
    public static boolean adminLogin(String path, String usernameLogin, String passwordLogin) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));
        boolean confirmarLogin = false;

        while (scannerFicheiro.hasNextLine() && !confirmarLogin){
            String linha = scannerFicheiro.nextLine();

            String [] linhaDividida = linha.split(";");
            if (usernameLogin.equals(linhaDividida[0]) && passwordLogin.equals(linhaDividida[1]))
                confirmarLogin = true;
        }

        return confirmarLogin;
    }
}

package FichaPratica01.Ex02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;
    private String name;

    public Logger(String name) {
        this.name = name;
    }

    public static Logger getInstance(String name){

        if (instance == null){
            instance = new Logger(name);
        }
        return instance;
    }

    File caminhoDiretorio = new File("src/FichaPratica01/Ex02/log.txt");

    public void log(String log) throws IOException {
        FileWriter texto = new FileWriter(caminhoDiretorio, true);
        texto.append("\n" + log);
        texto.close();
    }
}

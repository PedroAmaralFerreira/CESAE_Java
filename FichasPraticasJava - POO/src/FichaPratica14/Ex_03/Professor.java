package FichaPratica14.Ex_03;

import FichaPratica14.Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Professor {
    private ArrayList<AreaFormacao> areaFormacao;
    private int nivelAcademico;

    public Professor(int nivelAcademico) {
        this.areaFormacao = new ArrayList<AreaFormacao>();
        this.nivelAcademico = nivelAcademico;
    }

    public void lancarNota(){

    }
}

package FichaPratica14.Ex_03;

import FichaPratica14.Ex_03.Enums.DisciplinaCurso;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<DisciplinaCurso> disciplina;
    private boolean longaDuracao;

    public Curso(String nome, ArrayList<DisciplinaCurso> disciplina, boolean longaDuracao) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.longaDuracao = longaDuracao;
    }

    public void criarCurso(){

    }
}

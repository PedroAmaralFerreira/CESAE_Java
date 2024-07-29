package FichaPratica14.Ex_03;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String localizacao;
    private int lotacaoMaxima;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Curso> cursos;
    private ArrayList<Aluno> alunos;

    public Escola(String nome, String localizacao, int lotacaoMaxima) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotacaoMaxima = lotacaoMaxima;
        this.professores = new ArrayList<Professor>();
        this.disciplinas = new ArrayList<Disciplina>();
        this.cursos = new ArrayList<Curso>();
        this.alunos = new ArrayList<Aluno>();
    }

    public void addProfessor(){

    }

    public void addCurso(){

    }

    public void addDisciplina(){

    }

    public void addAluno(){

    }
}

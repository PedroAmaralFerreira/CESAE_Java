package FichaPratica08.Ex_08;

public class Ex_08 {
    public static void main(String[] args) {

        Aluno pedro = new Aluno("Pedro",23,"Engenharia Informática",18);
        Aluno quim = new Aluno("Joaquim",35,"Arquitetura",5.5);


        System.out.println("Situação do Pedro: "+pedro.situacao());
        System.out.println("Situação do Joaquim: "+quim.situacao());


    }
}

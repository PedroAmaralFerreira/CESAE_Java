package FichaPratica08.Ex_02;

public class Cao {

    private String nome = "Jimmy";
    private String raca = "Labrador";
    private String latido = "Au au au";

    public Cao(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public void ladrar(){
        System.out.println(latido);
    }

    public void latir(String novoLatido){
        System.out.println(novoLatido);
    }

}

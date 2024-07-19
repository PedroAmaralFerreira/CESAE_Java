package FichaPratica09.Ex_03;

public class Ex_03 {
    public static void main(String[] args) {

        // Buscar classe
        Animal animal = new Animal("Miquelina", "Vaca","Portugal",510, new Alimentos[]{Alimentos.ERVA,Alimentos.PALHA,Alimentos.NABO,Alimentos.REPOLHO});

        // Apresentar peso
        System.out.println("Peso Atual: "+animal.pesoAnimal());

        // Apresentar se comeu (Comida que gosta)
        if(animal.comer("nabo", 500)){
           System.out.println("O animal comeu.");
        } else {
           System.out.println("O animal recusou essa comida.");
        }

        // Apresentar peso
        System.out.println("Peso Atual: "+animal.pesoAnimal());

        // Apresentar se comeu (Comida que nao gosta)
        if(animal.comer("frango", 500)){
            System.out.println("O animal comeu.");
        } else {
            System.out.println("O animal recusou essa comida.");
        }

        // Apresentar peso
        System.out.println("Peso Atual: "+animal.pesoAnimal());
    }
}

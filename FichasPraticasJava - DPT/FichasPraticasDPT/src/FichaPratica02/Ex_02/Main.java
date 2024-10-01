package FichaPratica02.Ex_02;

public class Main {
    public static void main(String[] args) {

        Taco tacoCarnePicada = FactoryMethod.createTaco("Carne Picada","Taco de Carne Picada", 2.0);
        Taco tacoCarneFrango = FactoryMethod.createTaco("Carne Frango","Taco de Carne Frango", 1.75);
        Taco tacoVegetariano = FactoryMethod.createTaco("Vegetariano","Taco de Carne Vegetariano", 2.25);

        tacoCarnePicada.prepare();
        tacoCarnePicada.bake();
        tacoCarnePicada.box();
        tacoCarnePicada.display();

        tacoCarneFrango.prepare();
        tacoCarneFrango.bake();
        tacoCarneFrango.box();
        tacoCarneFrango.display();

        tacoVegetariano.prepare();
        tacoVegetariano.bake();
        tacoVegetariano.box();
        tacoVegetariano.display();
    }
}
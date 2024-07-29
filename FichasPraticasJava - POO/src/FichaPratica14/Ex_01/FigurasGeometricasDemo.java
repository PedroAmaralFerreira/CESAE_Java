package FichaPratica14.Ex_01;

public class FigurasGeometricasDemo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo("Azul",12,6);
        Triangulo triangulo = new Triangulo("Vermelho",8,5,5,8);
        Circulo circulo = new Circulo("Verde",10);

        System.out.println("Retângulo");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());

        System.out.println("\n**********\n");

        System.out.println("Triângulo");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());

        System.out.println("\n**********\n");

        System.out.println("Círculo");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.print("Perimetro: ");
        System.out.printf("%.2f", circulo.calcularPerimetro());
    }
}
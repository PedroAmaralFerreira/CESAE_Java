package FichaPratica03.Ex_04;

public class Main {
    public static void main(String[] args) {

        ImageProcessor processor = new ImageProcessor(new BlackAndWhiteFilterStrategy());
        processor.applyFilter("imagem1.jpg");

        processor = new ImageProcessor(new SepiaFilterStrategy());
        processor.applyFilter("imagem2.jpg");

        processor = new ImageProcessor(new VintageFilterStrategy());
        processor.applyFilter("imagem3.jpg");

    }
}

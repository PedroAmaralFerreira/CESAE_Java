package FichaPratica03.Ex_04;

public class BlackAndWhiteFilterStrategy implements ImageFilterStrategy{

    @Override
    public void useFilter(String image) {
        System.out.println("Aplicar filtro preto e branco na imagem " + image);
    }
}

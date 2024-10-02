package FichaPratica03.Ex_04;

public class SepiaFilterStrategy implements ImageFilterStrategy{
    @Override
    public void useFilter(String image) {
        System.out.println("Aplicar filtro sépia na imagem " + image);
    }
}

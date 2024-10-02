package FichaPratica03.Ex_04;

public class VintageFilterStrategy implements ImageFilterStrategy{
    @Override
    public void useFilter(String image) {
        System.out.println("Aplicar filtro vintage na imagem " + image);
    }
}

package FichaPratica02.Ex_02;

public class FactoryMethod {
    public static Taco createTaco(String tipoTaco, String nomeComida, double precoComida) {
        switch (tipoTaco) {
            case "Carne Picada":
                return new TacoTipoCarne(nomeComida, precoComida);
            case "Carne Frango":
                return new TacoTipoFrango(nomeComida, precoComida);
            case "Vegetariano":
                return new TacoTipoVegetariano(nomeComida, precoComida);
            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: " + tipoTaco);
        }
    }
}

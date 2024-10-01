package FichaPratica02.Ex_01;

public class ProductFactory {
    public static Product createProduct(String type, String name, Double price){
        switch (type){
            case "book":
                return new Book(name, price);
            case "eletronics":
                return new Eletronics(name, price);
            case "clothing":
                return new Clothing(name, price);
            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: " + type);
        }
    }
}

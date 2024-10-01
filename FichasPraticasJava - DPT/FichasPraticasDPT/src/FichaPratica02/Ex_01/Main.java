package FichaPratica02.Ex_01;

public class Main {
    public static void main(String[] args){
        Product javaHeadFirst = ProductFactory.createProduct("book", "Java Heads First", 50.0);
        Product pcHP = ProductFactory.createProduct("eletronics", "Laptop HP", 1500.0);
        Product tshirt = ProductFactory.createProduct("clothing", "T-Shirt Preta", 25.0);

        pcHP.display();
        javaHeadFirst.display();
        tshirt.display();

        ShoppingCart sc = new ShoppingCart("Pedro Ferreira");
        sc.addProduto(pcHP);
        sc.addProduto(tshirt);
        sc.addProduto(javaHeadFirst);

        sc.printCart();
        System.out.println("Total: " + sc.cartTotal());
    }
}

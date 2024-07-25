package FichaPratica11.PizzasDaPequenaPizzaria;

import FichaPratica11.PizzasDaPequenaPizzaria.Enums.*;
import FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes.Base;
import FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes.Ingrediente;
import FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes.Queijo;

public class Main {
    public static void main(String[] args) {

        Queijo mozzarella = new Queijo(1,"Mozzarella", UnidadeMedida.GRAMAS,3, OrigemIngrediente.IMPORTADO, TipoQueijo.MOZZARELLA);
        Queijo cabra = new Queijo(2,"Cabra", UnidadeMedida.GRAMAS,5,OrigemIngrediente.NACIONAL,TipoQueijo.CABRA);
        Queijo cheddar = new Queijo(3,"Cheddar", UnidadeMedida.GRAMAS,8,OrigemIngrediente.IMPORTADO,TipoQueijo.CHEDDAR);
        Queijo provolone = new Queijo(4,"Provolone", UnidadeMedida.GRAMAS,7,OrigemIngrediente.IMPORTADO,TipoQueijo.PROVOLONE);

        Base baseFina = new Base(99,"Base Fina",UnidadeMedida.GRAMAS,200,TipoBase.MASSA_FINA,"Clássica");
        Base baseAlta = new Base(100, "Base Alta",UnidadeMedida.GRAMAS,250,TipoBase.MASSA_ALTA,"Clássica");

        Pizza quatroQueijos = new Pizza(1,"Quatro Queijos","Pizza com queijo ou queijo com pizza?",15, TamanhoPizza.GRANDE);
        quatroQueijos.addIngrediente(new IngredientePizza(baseFina,100));
        quatroQueijos.addIngrediente(new IngredientePizza(mozzarella,100));
        quatroQueijos.addIngrediente(new IngredientePizza(cabra,100));
        quatroQueijos.addIngrediente(new IngredientePizza(cheddar,100));
        quatroQueijos.addIngrediente(new IngredientePizza(provolone,100));

        quatroQueijos.exibirDetalhesPizza();
    }
}
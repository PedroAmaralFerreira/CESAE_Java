package FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes;

import FichaPratica11.PizzasDaPequenaPizzaria.Enums.OrigemIngrediente;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.TipoFrutoMar;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.TipoQueijo;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.UnidadeMedida;

public class Queijo extends Topping{
    private TipoQueijo tipo;

    public Queijo(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoQueijo tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}

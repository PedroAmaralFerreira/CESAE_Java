package FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes;

import FichaPratica11.PizzasDaPequenaPizzaria.Enums.OrigemIngrediente;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.TipoFrutoMar;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.UnidadeMedida;

public class FrutoMar extends Topping{
    private TipoFrutoMar tipo;

    public FrutoMar(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}

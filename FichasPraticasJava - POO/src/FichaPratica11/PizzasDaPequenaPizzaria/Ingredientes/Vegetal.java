package FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes;

import FichaPratica11.PizzasDaPequenaPizzaria.Enums.OrigemIngrediente;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.TipoVegetal;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.UnidadeMedida;

public class Vegetal extends Topping{
    private TipoVegetal tipo;

    public Vegetal(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoVegetal tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}

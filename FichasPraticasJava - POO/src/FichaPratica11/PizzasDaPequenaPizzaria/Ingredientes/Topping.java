package FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes;

import FichaPratica11.PizzasDaPequenaPizzaria.Enums.OrigemIngrediente;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.UnidadeMedida;

public class Topping extends Ingrediente{
    private OrigemIngrediente origem;

    public Topping(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem) {
        super(id, nome, unidadeMedida, calorias);
        this.origem = origem;
    }
}

package FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes;

import FichaPratica11.PizzasDaPequenaPizzaria.Enums.OrigemIngrediente;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.TipoCarne;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.UnidadeMedida;

public class Carne extends Topping{
    private TipoCarne tipo;

    public Carne(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoCarne tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}

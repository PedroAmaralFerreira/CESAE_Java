package FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes;

import FichaPratica11.PizzasDaPequenaPizzaria.Enums.TipoBase;
import FichaPratica11.PizzasDaPequenaPizzaria.Enums.UnidadeMedida;

public class Base extends Ingrediente{
    private TipoBase tipoBase;
    private String descricao;

    public Base(int id, String nome, UnidadeMedida unidadeMedida, double calorias, TipoBase tipoBase, String descricao) {
        super(id, nome, unidadeMedida, calorias);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}

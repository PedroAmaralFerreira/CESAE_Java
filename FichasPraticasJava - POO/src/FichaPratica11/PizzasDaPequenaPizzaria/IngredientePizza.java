package FichaPratica11.PizzasDaPequenaPizzaria;

import FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes.Ingrediente;

public class IngredientePizza {

    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDetalhesPizzaIngredientes(){
        this.ingrediente.exibirDetalhesIngredientes();
        System.out.print(this.quantidade + " ");

        switch (this.ingrediente.getUnidadeMedida()){
            case GRAMAS:
                System.out.println("g");
                break;
            case LITROS:
                System.out.println("L");
                break;
            case UNIDADES:
                System.out.println("uni.");
                break;
            default:
                System.out.println("ERRO!");
                break;
        }
    }
}

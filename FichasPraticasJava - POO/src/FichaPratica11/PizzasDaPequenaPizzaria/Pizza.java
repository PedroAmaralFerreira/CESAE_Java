package FichaPratica11.PizzasDaPequenaPizzaria;

import FichaPratica11.PizzasDaPequenaPizzaria.Enums.TamanhoPizza;
import FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes.Base;
import FichaPratica11.PizzasDaPequenaPizzaria.Ingredientes.Topping;

import java.util.ArrayList;

public class Pizza {

    private final int MAX_INGREDIENTES = 5;
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> ingredientes;

    public Pizza(int id, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngredientePizza>();
    }

    /**
     * Método para adicionar um novo <b>IngredientePizza</b> a <b>ingredientes</b>
     *
     * @param novoIngrediente <b>IngredientePizza</b> a ser adicionado
     */
    public void addIngrediente(IngredientePizza novoIngrediente){
        if(this.ingredientes.isEmpty()){
            if (novoIngrediente.getIngrediente() instanceof Base){
                this.ingredientes.add(novoIngrediente);
            }
        } else {
            if (novoIngrediente.getIngrediente() instanceof Topping && this.ingredientes.size() < MAX_INGREDIENTES){
                this.ingredientes.add(novoIngrediente);
            }
        }
    }

    public void removerIngrediente(int idRemover){
        for (IngredientePizza ingredientePizzaAtual: this.ingredientes){
            if(ingredientePizzaAtual.getIngrediente().getId() == idRemover){
                this.ingredientes.remove(ingredientePizzaAtual);
                return;
            }
        }
    }

    public void alterarQuantidadeIngrediente(int idRemover, double novaQuantidade){
        for (IngredientePizza ingredientePizzaAtual: this.ingredientes){
            if(ingredientePizzaAtual.getIngrediente().getId() == idRemover){
                ingredientePizzaAtual.setQuantidade(novaQuantidade);
                return;
            }
        }
    }

    public double totalCalorias(){
        double totalCaloriasPizza = 0;

        for (IngredientePizza ingredientePizzaAtual: this.ingredientes){
            totalCaloriasPizza += ingredientePizzaAtual.getIngrediente().getCalorias() * ingredientePizzaAtual.getQuantidade();
        }

        return totalCaloriasPizza;
    }

    public void exibirDetalhesPizza(){
        System.out.println("***** " + this.nome + " *****");
        System.out.println("Código: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + "€");
        System.out.println("Tamanho: " + this.tamanho);

        int cont = 1;
        for (IngredientePizza ingredientePizzaAtual: this.ingredientes){
            System.out.print("Ingrediente " + cont++ + ": ");
            ingredientePizzaAtual.exibirDetalhesPizzaIngredientes();
        }
    }
}

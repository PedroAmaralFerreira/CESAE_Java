package Entidades;

import Itens.ArmaPrincipal;
import Itens.ConsumivelCombate;
import Itens.ItemHeroi;
import Itens.Pocao;

import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItemHeroi> loja;

    public Vendedor() {
        this.loja = new ArrayList<ItemHeroi>();
    }

    // Impressao da loja
    public boolean imprimirLoja(){
        if (loja.isEmpty()){
            System.out.println("Já não tenho mais nada para vender. Volta mais tarde!");
            return false;
        } else {
            int indice = 1;
            for (ItemHeroi item : loja) {
                System.out.println(indice + ". " + item.nome + " [ Preço: " + item.preco + " ouro | Heróis Permitidos: " + item.heroisPermitidos + " ]");
                indice++;
            }
            return true;
        }
    }

    /**
     * Venda de itens
     *
     * @param heroi Ira atualizar os itens do inventario
     * @param indiceItem Ira organizar os itens por order numerica
     */
    public void vender(Heroi heroi, int indiceItem) {
        if (indiceItem < 1 || indiceItem > loja.size()) {
            System.out.println("Índice inválido!");
        } else {

            ItemHeroi item = loja.get(indiceItem - 1);

            // Condicoes que dirao se o item ja existe no inventario
            // e se a Arma Principal desejada podera ser comprada, base na personagem
            if (!item.heroisPermitidos.isEmpty() && !item.heroisPermitidos.contains(heroi.getClass().getSimpleName())) {
                System.out.println("Este item não pode ser comprado por um " + heroi.getClass().getSimpleName() + ".");
                return;
            }

            if (item instanceof ArmaPrincipal && !item.permitirCompra(heroi)) {
                System.out.println("Este item não pode ser comprado por um " + heroi.getClass().getSimpleName() + ".");
                return;
            }

            if (item instanceof Pocao && heroi.inventario.contains(item)) {
                System.out.println("Você já possui uma " + item.nome + " no inventário.");
                return;
            }

            if (item instanceof ConsumivelCombate && heroi.inventario.contains(item)) {
                System.out.println("Você já possui uma " + item.nome + " no inventário.");
                return;
            }

            // Compra do item
            if (heroi.ouro >= item.preco) {
                heroi.ouro -= item.preco;
                if (item instanceof Pocao) {
                    heroi.inventario.add((Pocao) item);
                } else if (item instanceof ArmaPrincipal) {
                    heroi.armaPrincipal = (ArmaPrincipal) item;
                } else if (item instanceof ConsumivelCombate) {
                    heroi.inventario.add((ConsumivelCombate) item);
                }
                loja.remove(item);
                System.out.println(item.nome + " foi comprado!");
            } else {
                System.out.println("Ouro insuficiente para comprar " + item.nome);
            }
        }
    }

    /**
     * Adicionar item
     *
     * @param item Receber item para adicionar
     */
    public void adicionarItem(ItemHeroi item){
        loja.add(item);
    }
}
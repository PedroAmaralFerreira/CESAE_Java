package Itens;

import Entidades.Heroi;

import java.util.ArrayList;

public class ItemHeroi {
    public String nome;
    public int preco;
    public ArrayList<String> heroisPermitidos;

    public ItemHeroi(int preco, String nome) {
        this.preco = preco;
        this.nome = nome;
        this.heroisPermitidos = new ArrayList<String>();
    }

    /**
     * Verifica o tipo de Heroi
     *
     * @param tipoHeroi Adiciona itens que o heroi pode comprar
     */
    public void armaPrincipalPermitida(String tipoHeroi){
        this.heroisPermitidos.add(tipoHeroi);
    }

    /**
     * Permitir compra do item
     *
     * @param heroi Recebe Heroi que pode comprar o item
     * @return Retorna o tipo de heroi
     */
    public boolean permitirCompra(Heroi heroi){
        return this.heroisPermitidos.contains(heroi.getClass().getSimpleName());
    }

    /**
     * Mostrar Detalhes dos itens
     */
    public void mostrarDetalhes(){
        System.out.println(this.nome + " [ Preço: " + this.preco + " ouro | Heróis Permitidos: " + this.heroisPermitidos + " ]");
    }
}
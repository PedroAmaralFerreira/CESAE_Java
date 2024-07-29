package FichaPratica14.Ex_02;

import FichaPratica14.Ex_02.enums.Categoria;

public class Jogo {
    public static void main(String[] args) {

        Personagem dave = new Personagem("Dave, O Bárbaro",100,25,1, Categoria.CAVALEIRO, "Espada");

        NPC inimigo1 = new NPC("Goblin",50,10);
        NPC inimigo2 = new NPC("Orc",80,15);
        NPC inimigo3 = new NPC("Dragon",200,25);

        dave.atacarInimigo(inimigo1);
        dave.atacarInimigo(inimigo2);
        dave.atacarInimigo(inimigo3);
    }
}
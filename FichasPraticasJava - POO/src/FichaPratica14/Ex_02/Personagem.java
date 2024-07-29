package FichaPratica14.Ex_02;

import FichaPratica14.Ex_02.enums.Categoria;

public class Personagem extends Entidade{
    private int atributoNivel;
    private Categoria categoria;
    private String arma;

    public Personagem(String nome, int vida, int forca, int atributoNivel, Categoria categoria, String arma) {
        super(nome, vida, forca);
        this.atributoNivel = atributoNivel;
        this.categoria = categoria;
        this.arma = arma;
    }

    public void atacarInimigo(NPC inimigo){
        while (this.vida > 0 && inimigo.vida > 0){
            //Personagem ataca inimigo
            inimigo.setVida(inimigo.vida - this.forca);
            System.out.println("* " + inimigo.nome + " perdeu " + this.forca + " pontos de vida *");
                if (inimigo.vida <= 0){
                    break;
                }

            // Inimigo ataca a personagem
            this.vida -= inimigo.forca;
            System.out.println("* " + this.nome + " perdeu " + inimigo.forca + " pontos de vida *");
                if (this.vida <= 0){
                    break;
                }
            }

            if (this.vida > 0){
                System.out.println("Parabéns, " + this.categoria + " " + this.nome + "! Venceste o " + inimigo.nome + " usando " + this.arma + "!");
                this.atributoNivel++;
                this.vida += this.vida * 0.1;
                this.forca += this.forca * 0.1;
            } else {
                System.out.println("Perdeste!");
            }
        System.out.println();
        }
    }
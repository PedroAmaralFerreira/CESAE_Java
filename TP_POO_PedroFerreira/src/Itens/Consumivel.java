package Itens;

public abstract class Consumivel extends ItemHeroi {

        public Consumivel(int preco, String nome) {
            super(preco, nome);
        }

    /**
     * Nome do consumivel
     *
     * @return Retorna o nome do consumivel
     */
    @Override
        public String toString() {
            return this.nome;
        }
    }
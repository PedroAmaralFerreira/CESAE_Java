package FichaPratica10.Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }

    public void addMusica(Musica musicaNova){
        this.programacao.add(musicaNova);
    }

    public void trocarMusica(int indexTroca, String tituloNovo, String generoNovo, String artistaNovo, int duracaoNovo){
        Musica musicaNova = new Musica(tituloNovo,generoNovo,artistaNovo,duracaoNovo);
        programacao.set(indexTroca,musicaNova);
    }

    public void removerMusica(Musica musicaRemover){
        programacao.remove(musicaRemover);
    }

    public void removerAll(){
        programacao.clear();
    }

    public void imprimirRelatorio(){
        System.out.println("\n*****Relatório de Músicas*****\n");
        for (int i = 0; i < this.programacao.size(); i++) {
            this.programacao.get(i).exibirDetalhes();
        }
        if (this.programacao.isEmpty()){
            System.out.println("Não existem músicas");
        }
    }

    public void duracao(){

        int duracaoTotal = 0;

        for (int i = 0; i < this.programacao.size(); i++) {
            duracaoTotal += this.programacao.get(i).getDuracao();
        }

        int horas = duracaoTotal / 3600;
        int minutos = (duracaoTotal % 3600) / 60;
        int segundos = duracaoTotal % 60;

        if (horas == 0){
            System.out.println("Duração Total é: " + minutos + "m:" + segundos + "s");
        } else {
            System.out.println("Duração Total é: " + horas + "h:" + minutos + "m:" + segundos +"s");
        }
    }
}
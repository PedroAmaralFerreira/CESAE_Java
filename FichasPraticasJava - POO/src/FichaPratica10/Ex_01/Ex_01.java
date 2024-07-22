package FichaPratica10.Ex_01;

public class Ex_01 {
    public static void main(String[] args) {

        Musica musica1 = new Musica("Hold Back The River", "POP/ROCK", "James Bay", 214);
        Musica musica2 = new Musica("Water", "Amapiano", "Tyla", 192);
        Musica musica3 = new Musica("Queen Tings", "R&B/Soul", "Masego", 184);
        Musica musica4 = new Musica("Marilyn", "POP", "Alice Kristiansen", 202);

        MusicPlayer player = new MusicPlayer();

        player.addMusica(musica1);
        player.addMusica(musica2);
        player.addMusica(musica3);
        player.addMusica(musica4);

        player.imprimirRelatorio();

        player.trocarMusica(1,"Blessed", "R&B", "Daniel Caesar", 241);
        player.imprimirRelatorio();

        player.removerMusica(musica4);
        player.imprimirRelatorio();

        player.duracao();

        player.removerAll();
        player.imprimirRelatorio();
    }
}

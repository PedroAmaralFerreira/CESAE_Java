    package FichaPratica10.Ex_03;

    public class Ex_03 {
        public static void main(String[] args) {

            BarcoPesca barcoPesca = new BarcoPesca(Marca.DEVLIN.name(), "Preto", 2001, 15, 500);

            barcoPesca.pescarPeixe("Carapau", 0.15, 4, 20);

            barcoPesca.exibirDetalhes();
        }
    }

    package FichaPratica10.Ex_03;

    public class Ex_03 {
        public static void main(String[] args) {

            Peixe sardinhas = new Peixe("Sardinha", 100, 12);
            Peixe peixeEspada = new Peixe("Peixe Espada", 150, 50);
            Peixe dourada = new Peixe("Dourada", 50, 20);

            Marisco caranguejo = new Marisco("Caranguejo",200,100);
            Marisco ameijoa = new Marisco("Ameijoa",50,90);
            Marisco lagosta = new Marisco("Lagosta",150,200);

            BarcoPesca bp = new BarcoPesca("Santa Maria do Mar", "Branco", 1998, 4, Marca.SMARTILNER, 300);

            bp.addPeixe(sardinhas);
            bp.addPeixe(dourada);

            bp.addMarisco(caranguejo);
            bp.addMarisco(ameijoa);
            bp.addMarisco(lagosta);

            bp.exibirDetalhes();

        }
    }

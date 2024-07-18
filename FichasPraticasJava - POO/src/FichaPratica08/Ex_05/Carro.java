package FichaPratica08.Ex_05;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private String tipoCombustivel;
    private double litros100Km;
    private int cilindrada;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, String tipoCombustivel, double litros100Km, int cilindrada){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100Km = litros100Km;
        this.cilindrada = cilindrada;
    }

    public void ligar(){
        if(this.anoFabrico < 1994 && this.tipoCombustivel.equalsIgnoreCase("DIESEL")){
            System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
            System.out.println("Vrum-Vrum-Vrum");
        } else if (this.anoFabrico < 1994 && !this.tipoCombustivel.equalsIgnoreCase("DIESEL")) {
            System.out.println("Custa a pegar... O carro está ligado!");
            System.out.println("Vrum-Vrum-Vrum");
        } else if (this.anoFabrico >= 1994 && this.potencia < 250) {
            System.out.println("O carro está ligado!");
            System.out.println("Vruummmmmmm");
        } else if (this.anoFabrico >= 1994 && this.potencia >= 250) {
            System.out.println("O carro está ligado!");
            System.out.println("VRUUMMMMMM");
        }
        System.out.println();
    }

    public void corrida(Carro carroAdversario) {
        if (this.potencia > carroAdversario.potencia) {
            System.out.println("Vencedor: " + this.marca + " " + this.modelo);
            if (this.marca.equalsIgnoreCase("Faísca")) {
                System.out.println("CATCHAAAAUUUU!");
            }
        } else if (this.potencia == carroAdversario.potencia) {
            if (this.cilindrada > carroAdversario.cilindrada) {
                System.out.println("Vencedor: " + this.marca + " " + this.modelo);
            } else if (this.cilindrada == carroAdversario.cilindrada) {
                if (this.anoFabrico > carroAdversario.anoFabrico) {
                    System.out.println("Vencedor: " + this.marca + " " + this.modelo);
                } else if (this.anoFabrico == carroAdversario.anoFabrico) {
                    System.out.println("Empate!");
                } else {
                    System.out.println("Vencedor: " + carroAdversario.marca + " " + carroAdversario.modelo);
                }
            } else {
                System.out.println("Vencedor: " + carroAdversario.marca + " " + carroAdversario.modelo);
            }
        } else {
            System.out.println("Vencedor: " + carroAdversario.marca + " " + carroAdversario.modelo);
        }
    }

    public void consumoKm(Carro carro2, double distanciaKm){
        double litrosPorKm = this.litros100Km / 100;
        litrosPorKm *= distanciaKm;
        System.out.print("Em "+distanciaKm+"Km, o "+ this.marca+" "+ this.modelo+" consumiu ");
        System.out.printf("%.1f", litrosPorKm);
        System.out.println("L");

        double litrosPorKm2 = carro2.litros100Km / 100;
        litrosPorKm2 *= distanciaKm;
        System.out.print("Em "+distanciaKm+"Km, o "+ carro2.marca+" "+ carro2.modelo+" consumiu ");
        System.out.printf("%.1f", litrosPorKm2);
        System.out.println("L");

        if (litrosPorKm > litrosPorKm2){
            System.out.println(this.marca + " " + this.modelo + " gastou mais!");
        } else {
            System.out.println(carro2.marca + " " + carro2.modelo + " gastou mais!");
        }
    }

    public String atributos(){
        return marca;
    }


}

package FichaPratica09.Ex_04;

public class Imovel {

    private String rua;
    private int numPorta;
    private String cidade;
    private TipoCasa tipoCasa;
    private Acabamento acabamento;
    private double area;
    private int numQuartos;
    private int numWC;
    private double areaPiscina;

    public Imovel(String rua, int numPorta, String cidade, TipoCasa tipoCasa, Acabamento acabamento, double area, int numQuartos, int numWC, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipoCasa = tipoCasa;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numWC = numWC;
        this.areaPiscina = areaPiscina;
    }

    public double calcularImovel(){

        // Declarar variavel
        double valorTotal = 0;

        // Valor por metro quadrado
        switch (this.tipoCasa) {
            case APARTAMENTO:
                valorTotal = this.area * 1000;
                break;
            case CASA:
                valorTotal = this.area * 3000;
                break;
            case MANSAO:
                valorTotal = this.area * 5000;
                break;
            default:
                System.out.println("ERRO: Tipo casa não encontrado!");
        }

        // Valor por cada quarto
        valorTotal += this.numQuartos * 7500;

        // Valor por cada WC
        valorTotal += this.numWC * 10500;

        switch (this.acabamento){
            case RESTAURO:
                valorTotal *= 0.5;
                break;
            case USADA:
                valorTotal *= 0.9;
                break;
            case NOVA:
                break;
            case NOVA_ALTO:
                double valorizar = 0;
                valorizar = valorTotal * 0.25;
                valorTotal += valorizar;
                break;
            default:
                System.out.println("Erro: Acabamento não conhecido!");
                break;
        }

        valorTotal += this.areaPiscina * 1000;

        return valorTotal;
    }

    public Acabamento mudarAcabamento(Acabamento novoAcabamento){
        return this.acabamento = novoAcabamento;
    }

    public void imprimirDescricao(){
        System.out.println("\n----------***----------\n");
        System.out.println("Imovel: "+this.tipoCasa);
        System.out.println("Acabamento: "+this.acabamento);
        System.out.println("Área: "+this.area+"m2");
        System.out.println("Número de quartos: "+this.numQuartos);
        System.out.println("Número de WC: "+this.numWC);
        System.out.println("Área da Piscina: "+this.areaPiscina+"m2");
    }

    public String compararImoveis(Imovel imovel2){
        double valorTotal1 = calcularImovel();
        double valorTotal2 = imovel2.calcularImovel();

        if (valorTotal1 > valorTotal2){
            return "Primeiro Imóvel";
        } else {
            return "Segundo Imóvel";
        }
    }
}

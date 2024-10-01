package FichaPratica02.Ex_03;

public class Spreadsheet extends Documento{

    public Spreadsheet(String autor, String nome, String extensao) {
        super(autor, nome, extensao);
    }

    @Override
    public void open() {
        System.out.println(this.nome + this.extensao + " está aberto.");
    }

    @Override
    public void save() {
        System.out.println(this.nome + this.extensao + " foi guardado com sucesso!.");
    }

    @Override
    public void close() {
        System.out.println(this.nome + this.extensao + " fechou.");
    }
}

package FichaPratica02.Ex_03;

public class Main {
    public static void main(String[] args) {

        Documento turma = FactoryMethod.createDocument("Spreadsheet", "Vitor Santos", "Turma CESAE - Software Developer", ".xlsx");
        Documento letraMusica = FactoryMethod.createDocument("Text Document", "Pedro Ferreira", "Musica Escrita", ".docx");
        Documento apresentacaoFinal = FactoryMethod.createDocument("Presentation", "Pedro Ferreira", "Projeto Final", ".docx");

        turma.open();
        turma.save();
        turma.close();

        letraMusica.open();
        letraMusica.save();
        letraMusica.close();

        apresentacaoFinal.open();
        apresentacaoFinal.save();
        apresentacaoFinal.close();
    }
}

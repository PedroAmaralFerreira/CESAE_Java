package FichaPratica02.Ex_03;

import FichaPratica02.Ex_02.Taco;
import FichaPratica02.Ex_02.TacoTipoCarne;
import FichaPratica02.Ex_02.TacoTipoFrango;
import FichaPratica02.Ex_02.TacoTipoVegetariano;

public class FactoryMethod {
    public static Documento createDocument(String tipoDocumento, String autor, String nome, String extensao) {
        switch (tipoDocumento) {
            case "Presentation":
                return new Presentation(autor, nome, extensao);
            case "Spreadsheet":
                return new Spreadsheet(autor, nome, extensao);
            case "Text Document":
                return new TextDocument(autor, nome, extensao);
            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: " + tipoDocumento);
        }
    }
}

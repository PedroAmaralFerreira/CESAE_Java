package Utilidades;

public class MargemCategoria {
    public static double margemCategoria(String[][] matrizVendas){

        double valor=0, lucro=0;

        for (int i = 0; i < matrizVendas.length; i++) {
            valor = Double.parseDouble(matrizVendas[i][5]);
            switch (matrizVendas[i][3]){
                case "RPG":
                    lucro += valor * 0.1;
                    break;
                case "Metroidvania":
                    lucro += valor * 0.25;
                    break;
                case "Estrategia":
                    lucro += valor * 0.175;
                    break;
                case "Festa":
                    lucro += valor * 0.5;
                    break;
                case "MMORPG":
                    lucro += valor * 0.05;
                    break;
                case "Desporto":
                    lucro += valor * 0.425;
                    break;
                case "Luta":
                    lucro += valor * 0.275;
                    break;
                case "Tiros":
                    lucro += valor * 0.12;
                    break;
                case "Corridas":
                    lucro += valor * 0.13;
                    break;
                case "Aventura":
                case "Simulador":
                    lucro += valor * 0.3;
                    break;
                case "Arcada":
                case "Terror":
                    lucro += valor * 0.45;
                    break;
                case "Puzzle":
                    lucro += valor * 0.38;
                    break;
                case "Zombies":
                    lucro += valor * 0.39;
                    break;
                case "Misterio":
                    lucro += valor * 0.33;
                    break;
            }
        }

        return lucro;
    }
}

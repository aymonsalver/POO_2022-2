package FigurasGeometricas;

public class Rombo {
    double lado;
    double diagonalMayor;
    double diagonalMenor;

    public static double calcularArea(double diagonalMayor, double diagonalMenor){
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public static double calcularPerimetro(double lado){
        return 4 * lado;
    }
}
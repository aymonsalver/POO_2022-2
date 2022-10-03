package FigurasGeometricas;

public class Cuadrado {
    double lado;

    public static double calcularArea(double lado){
        return lado * lado;
    }

    public static double calcularPerimetro(double lado){
        return 4 * lado;
    }
}
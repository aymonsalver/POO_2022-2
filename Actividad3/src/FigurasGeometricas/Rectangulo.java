package FigurasGeometricas;

public class Rectangulo {
    double base;
    double altura;

    public static double calcularArea(double base, double altura){
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura){
        return (2 * base) + (2 * altura);
    }
}
package FigurasGeometricas;

public class Trapecio {
    double baseMayor;
    double baseMenor;
    double altura;
    double distanciaAltura;
    double hipotenusa;

    public static double calcularArea(double baseMayor, double baseMenor, double altura){
        return (baseMayor + baseMenor)/2 *altura;
    }

    public static double calcularPerimetro (double baseMayor, double baseMenor, double hipotenusa){
        return (2 * hipotenusa + baseMayor + baseMenor);
    }

    public static double calcularHipotenusa(double altura, double distanciaAltura){
        return Math.pow(Math.pow(distanciaAltura,2) + Math.pow(altura,2) , 0.5);
    }
}

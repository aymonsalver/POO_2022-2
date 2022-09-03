package FigurasGeometricas;

public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;
    int distanciaAltura;

    Trapecio(int baseMayor, int baseMenor, int altura, int distanciaAltura){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.distanciaAltura = distanciaAltura;
    }

    double calcularArea(){
        return (baseMayor * baseMenor)/2 *altura;
    }

    double calcularPerimetro(){
        return 2 * calcularHipotenusa() + baseMayor + baseMenor;
    }

    double calcularHipotenusa(){
        return Math.pow(Math.pow(distanciaAltura,2) + Math.pow(altura,2) , 0.5);
    }
}

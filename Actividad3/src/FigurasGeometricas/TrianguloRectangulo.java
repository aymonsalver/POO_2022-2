package FigurasGeometricas;

public class TrianguloRectangulo {
    double base;
    double altura;
    double hipotenusa;
    

    public static double calcularArea(double base, double altura){
        return (base * altura) / 2;
    }

    public static double calcularPerimetro(double base, double altura, double hipotenusa){
        return (base + altura + hipotenusa);
    }

    public static double calcularHipotenusa(double base, double altura){
        return Math.pow(Math.pow(base,2) + Math.pow(altura,2) , 0.5);
    }

    public static String tipoDeTriangulo(double base, double altura, double hipotenusa){
        if((base == altura) && (base == hipotenusa) && (altura == hipotenusa)){
            return("El triangulo es equilatero: ");
        }else if((base != hipotenusa && (base != altura)) && (altura != hipotenusa)){
            return("El triangulo es escaleno: ");
        }else{
            return("El triangulo es isóceles: ");
        }
    }
}
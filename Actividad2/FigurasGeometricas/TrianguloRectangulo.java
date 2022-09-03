package FigurasGeometricas;

public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        return (base * altura) / 2;
    }

    double calcularPerimetro(){
        return (base + altura + calcularHipotenusa());
    }

    double calcularHipotenusa(){
        return Math.pow(Math.pow(base,2) + Math.pow(altura,2) , 0.5);
    }

    void tipoDeTriangulo(){
        if((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("El triangulo es equilatero: ");
        }else if((base != calcularHipotenusa() && (base != altura)) && (altura != calcularHipotenusa())){
            System.out.println("El triangulo es escaleno: ");
        }else{
            System.out.println("El triangulo es isóceles: ");
        }
    }
}

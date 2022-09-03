package FigurasGeometricas;

public class Rombo {
    int lado;
    int diagonalMayor;
    int diagonalMenor;

    Rombo(int lado, int diagonalMayor, int diagonalMenor){
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    double calcularArea(){
        return (diagonalMayor * diagonalMenor) / 2;
    }

    double calcularPerimetro(){
        return 4 * lado;
    }
}

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el lado del Triangulo Equilatero: ");
		double L = Entrada.nextDouble();
		
		TrianguloEq TriEq_Nvo = new TrianguloEq();
		
		TriEq_Nvo.Lado = L;
		TriEq_Nvo.Perimetro = TriEq_Nvo.Perimetro_Tri(L);
		TriEq_Nvo.Altura = TriEq_Nvo.Altura_Tri(L);
		TriEq_Nvo.Area = TriEq_Nvo.Area_Tri(L, TriEq_Nvo.Altura);
		
		System.out.println("El valor del perimetro del Triangulo es: " + TriEq_Nvo.Perimetro);
		System.out.println("El valor de la altura del Triangulo es: " + TriEq_Nvo.Altura);
		System.out.println("El valor del area del Triagulo es:  " +  TriEq_Nvo.Area);

	}

}

//Ejemplo para poner
//18
//Resultado
//El valor del perimetro del Triangulo es: 54.0
//El valor de la altura del Triangulo es: 15.588457268119894
//El valor del area del Triagulo es:  140.29611541307904


class TrianguloEq{
	double Lado;
	double Perimetro;
	double Altura;
	double Area;
	
	public static double Altura_Tri (double Lado) {
		double H = (Math.sqrt(3)*Lado)/2;
		return H;
	}
	
	public static double Perimetro_Tri (double Lado) {
		double P = 3*Lado;
		return P;
	}
	
	public static double Area_Tri (double Lado, double Altura) {
		double A = (Lado*Altura)/2;
		return A;
	}
}


import java.util.Scanner;
import java.lang.Math;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Ingrese los lados del Triangulo: ");
		double L1 = Entrada.nextDouble();
		double L2 = Entrada.nextDouble();
		double L3 = Entrada.nextDouble();
		
		Triangulo Tri_Nvo = new Triangulo();
		
		Tri_Nvo.Lado1 = L1;
		Tri_Nvo.Lado2 = L2;
		Tri_Nvo.Lado3 = L3;
		Tri_Nvo.Perimetro = Tri_Nvo.Perimetro_Tri(L1, L2, L3);
		Tri_Nvo.Semiperimetro = Tri_Nvo.Semip_Tri(Tri_Nvo.Perimetro);
		Tri_Nvo.Area = Tri_Nvo.Area_Tri(L1, L2, L3, Tri_Nvo.Semiperimetro);
		
		System.out.println("El valor del perimetro del Triangulo es: " + Tri_Nvo.Perimetro);
		System.out.println("El valor del semiperimetro del Triangulo es: " + Tri_Nvo.Semiperimetro);
		System.out.println("El valor del area del Triagulo es:  " +  Tri_Nvo.Area);

	}

}

//Ejemplo para poner
//9 5 10
//Resultado
//24 12 22,45


class Triangulo{
	double Lado1;
	double Lado2;
	double Lado3;
	double Perimetro;
	double Semiperimetro;
	double Area;
	
	public static double Perimetro_Tri (double Lado1, double Lado2, double Lado3) {
		double P = Lado1+Lado2+Lado3;
		return P;
	}
	
	public static double Semip_Tri (double Perimetro) {
		double S = Perimetro/2;
		return S;
	}
	
	public static double Area_Tri (double Lado1, double Lado2, double Lado3,  double Semiperimetro) {
		double A = Math.sqrt(Semiperimetro*(Semiperimetro-Lado1)*(Semiperimetro-Lado2)*(Semiperimetro-Lado3));
		return A;
	}
}

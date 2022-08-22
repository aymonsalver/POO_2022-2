import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de A: ");
		double A = Entrada.nextDouble();
		
		System.out.println("Ingrese el valor de B: ");
		double B = Entrada.nextDouble();
		
		if(A>B) {
			System.out.println("A es mayor que B");
		}
		else if(A==B) {
			System.out.println("A es igual que B");
		}
		else{
			System.out.println("A es menor que B");
		}

	}

}

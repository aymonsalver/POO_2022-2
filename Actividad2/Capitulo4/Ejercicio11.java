 // @author Andres


import java.util.Random;
import java.util.Scanner;

public class Ejemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		
		 double num = aleatorio.nextDouble(500);
		 double nu = aleatorio.nextDouble(500);
		
		
		System.out.println("Ingrese el valor de A: ");
		double A = Entrada.nextDouble(); 
		
		System.out.println("Ingrese el valor de B: ");
		double B = Entrada.nextDouble();

		System.out.println("Ingrese el valor de C: ");
		double C = Entrada.nextDouble();

		if(A>B && A > C) {
			System.out.println("A es mayor : " +A);
		}
		else if(B>A && B>C) {
			System.out.println("B es mayor :"+B);
		}
		else if (C>A && C>B ){
			System.out.println("C es mayor  :"+C);
		}
		else if(A==B || A==C )  {
			System.out.println("Numeros iguales cambiaremos los numeros eh indicaremos resultado, si desea intente de nuevo con numeros diferentes");
			        
			         A=num; 
			          
			        else  if(A>B && A > C) {
			  			System.out.println("A es mayor : " +A);
			  		}
			  		else if(B>A && B>C) {
			  			System.out.println("B es mayor :"+B);
			  		}
			  	    else if (C>A && C>B ){
			  			System.out.println("C es mayor  :"+C);
			  	    }        
			  	    else if ( B==C) {
			  	    	       eB=nu;
			  	    	      else  if(A>B && A > C) {
					  			System.out.println("A es mayor : " +A);
					  		}
					  		else if(B>A && B>C) {
					  			System.out.println("B es mayor :"+B);
					  		}
					  	    else if (C>A && C>B ){
					  			System.out.println("C es mayor  :"+C);
			  	             }
			  	                     }
	                  }

   }
}



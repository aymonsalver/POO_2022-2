# POO_2022-2

// @author Andres
 
	
		import java.util.Scanner;

		public class EJEMPLO10 {

			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner Entrada = new Scanner(System.in);
	          Totalmatri nuevamat = new Totalmatri();
	                 
	          
	               

				System.out.println("Ingrese el numero de la inscripción: ");
				double Numinscri = Entrada.nextDouble();

				System.out.println("Ingrese su nombre por favor: ");
				String Nom = Entrada.next();
				
				System.out.println("Ingrese su nombre por favor: ");
				double Pat = Entrada.nextDouble();
				
				System.out.println("Ingrese su nombre por favor: ");
				double Est = Entrada.nextDouble();
				
				
				        nuevamat.pat = Pat;
						nuevamat.est =  Est;
				        nuevamat.aumento  = Totalmatri.aumento(Est);
                        nuevamat.numinscrip = Numinscri
				if(Pat > 2000000) &&  ( Est > 3  )
				{
					System.out.println("El numero de la incripción es: " + nuevamat.numinscrip);
					System.out.println("Nombre del estudiante : " + Nom);
					System.out.println("El valor de la matricula incrementara 3 % de  su patrimonio");
					System.out.println("El valor de la matricula es :"+ nuevamat.aumento);
					
				}
				
				
		      else( Pat < 2000000 ) && (Est < 3){
					System.out.println("El numero de la incripción es: " + nuevamat.numinscrip);
					System.out.println("Nombre del estudiante : " + Nom);
					
					System.out.println("El valor de la matricula es de $ 50 000 ");
				}

	}
			
	

	

	 class Totalmatri {
		 double pat;
		 double est;
		 
		 double numinscrip;
		 double aumento;
		
	 
		public static double aumento (double pat) {
		double a = pat*0.03 ;
		       a = a + 50000;
		return a;
	
		}
		
	 }	
	 
			
	 

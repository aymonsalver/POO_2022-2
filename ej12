import java.util.Scanner;

public class ejemplo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Entrada = new Scanner(System.in);
	

		System.out.println("Ingrese el nombre y apellidos del empleado: ");
		String PrimerNombre = Entrada.next();
		String PrimerApellido = Entrada.next();
		String SegundoApellido = Entrada.next();

		System.out.println("Ingrese la cantidad de horas trabajadas a la semana: ");
		double Hsemana = Entrada.nextDouble();

		System.out.println("Ingrese el valor de la hora trabajada");
		double Valor_Hr = Entrada.nextDouble();

		

		Empleado Sueldo = new Empleado();
	
		Sueldo.Nombres_Emp = PrimerNombre + " " + PrimerApellido + " " +  SegundoApellido;
		Sueldo.Hrs_semana = Hsemana;
		Sueldo.Valor_Hr = Valor_Hr;
		


	
		System.out.println("Nombre del empleado: " + Sueldo.Nombres_Emp +  " Su salario seria el siguiente : ");
		
		if (Hsemana <= 40) {
		     
		System.out.println("Salario bruto del empleado: " + ( Hsemana*Valor_Hr) );
		}
		else if (Hsemana<=48) {
			
			System.out.println("Salario bruto del empleado: " + Sueldo.Salariox2(Hsemana, Valor_Hr));
		}

		else {
			
			System.out.println("Salario bruto del empleado: "+ Sueldo.Salariox3(Hsemana, Valor_Hr));
		}
		

	
	}
	
}        


class Empleado {
	
	String Nombres_Emp;
	double Hrs_semana;		//Numero de horas trabajadas a la semana
	double Valor_Hr;
	

	public static double  Salariox2(double Hrsm40, double Valor_Hr,double Hrs_semana) {
		 Hrsm40 = Hrs_semana-40 * Valor_Hr;
		      Hrsm40 = Hrsm40+ (40*Valor_Hr);
		
		return Hrsm40;
	}

	public static double Salariox3(double Hrsm48, double Valor_Hr, double Hrs_semana) {
		 Hrsm48 =  (Hrs_semana-48)*3 * Valor_Hr ;
		 Hrsm48 =  Hrsm48+(16*Valor_Hr+ 40*Valor_Hr);
		return Hrsm48;
	}

}

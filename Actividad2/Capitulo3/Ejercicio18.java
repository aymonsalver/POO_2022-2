import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Ingrese el numero de cedula: ");
		int CC = Entrada.nextInt();
		
		System.out.println("Ingrese los nombre y apellidos del empleado: ");
		String PrimerNombre = Entrada.next();
		String PrimerApellido = Entrada.next();
		String SegundoApellido = Entrada.next();
		
		System.out.println("Ingrese la cantidad de horas trabajadas al mes: ");
		double Hrs_Mes = Entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la hora trabajada");
		double Valor_Hr = Entrada.nextDouble();
		
		System.out.println("Ingrese en porcentaje el valor de la retencion en la fuente: ");
		double Rete_Fnt = Entrada.nextDouble();
		
		Empleado Ptron = new Empleado();
		Ptron.Codigo_Emp = CC;
		Ptron.Nombres_Emp = PrimerNombre + " " + PrimerApellido + " " +  SegundoApellido;
		Ptron.Hrs_Mes = Hrs_Mes;
		Ptron.Valor_Hr = Valor_Hr;
		Ptron.Rete_Fnt = Rete_Fnt;
		
		
		System.out.println("Codigo del empleado: " + Ptron.Codigo_Emp);
		System.out.println("Nombre del empleado: " + Ptron.Nombres_Emp);
		System.out.println("Salario bruto del empleado: " + Ptron.Salario_Bruto(Hrs_Mes, Valor_Hr));
		System.out.println("Salario neto del empleado: " + Ptron.Salario_Neto(Ptron.Salario_Bruto(Hrs_Mes, Valor_Hr), Rete_Fnt));
		
		

	}
	
}

//Ejemplo para poner
//24052021 Milaneso Fabius Rex 48 5000 12,5
//Resultado
//240000 210000
class Empleado {
	int Codigo_Emp;
	String Nombres_Emp;
	double Hrs_Mes;		//Numero de horas trabajadas al mes
	double Valor_Hr;
	double Rete_Fnt;	//Porcentaje de retencion en la fuente
	
	public static double  Salario_Bruto(double Hrs_Mes, double Valor_Hr) {
		double Sal_Br = Hrs_Mes * Valor_Hr;
		//System.out.println("El salario bruto es: " + Sal_Br + " pesos ");
		return Sal_Br;
	}
	
	public static double Salario_Neto(double Sal_Br, double Rete_Fnt) {
		double Sal_Neto = Sal_Br - (Sal_Br * (Rete_Fnt/100));
		//System.out.println("El salario neto es: " + Sal_Neto);
		return Sal_Neto;
	}
}

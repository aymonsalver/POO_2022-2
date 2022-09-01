import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args){
        String nombreEmpleado;
        int salarioHora, horasTrabajadas, totalSalario;
        Scanner input = new Scanner(System.in); // ingresamos los datos por teclado
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = input.nextLine();
        System.out.println("Ingrese el salario por hora del empleado: ");
        salarioHora = input.nextInt();
        System.out.println("Ingrese el numero de horas trabajadas del empleado: ");
        horasTrabajadas = input.nextInt();

        totalSalario = salarioHora * horasTrabajadas; // calculamos el salario total

        if (totalSalario > 450000){  //evaluamos la condicion que indica el ejercicio
            System.out.println("El nombre del empleado es " + nombreEmpleado + " y tiene un salario de: " + totalSalario);
        }else {
            System.out.println("El nombre del empleado es: " + nombreEmpleado);
        }
    }
}

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        int ventasDepartamento1, ventasDepartamento2, ventasDepartamento3, salario, totalVentas;  // declaramos las variables
        double salarioDepartamento1, salarioDepartamento2, salarioDepartamento3, porcentajeVentas;
        int sD1, sD2, sD3;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la venta del departamento 1: "); //ingresamos los datos del usuario por teclado
        ventasDepartamento1 = input.nextInt();
        System.out.println("Ingrese la venta del departamento 2: ");
        ventasDepartamento2 = input.nextInt();
        System.out.println("Ingrese la venta del departamento 3: ");
        ventasDepartamento3 = input.nextInt();
        System.out.println("Ingrese el salario de los departamentos: ");
        salario = input.nextInt();

        totalVentas = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3; //calculamos el total de ventas
        porcentajeVentas = totalVentas * 0.33;  //calculamos el porcentaje de ventas

        if(ventasDepartamento1 > porcentajeVentas){     //Comprobamos las condiciones en todos los departamentos
            salarioDepartamento1 = salario + (salario * 0.2);
            sD1 = (int)salarioDepartamento1;  // convertimos el salario en un entero para que su salida este mejor presentada
        } else{
            salarioDepartamento1 = salario;
            sD1 = (int)salarioDepartamento1;
        }

        if(ventasDepartamento2 > porcentajeVentas){
            salarioDepartamento2 = salario + (salario * 0.2);
            sD2 = (int)salarioDepartamento2;
        } else{
            salarioDepartamento2 = salario;
            sD2 = (int)salarioDepartamento2;
        }

        if(ventasDepartamento3 > porcentajeVentas){
            salarioDepartamento3 = salario + (salario * 0.2);
            sD3 = (int)salarioDepartamento3;
        } else{
            salarioDepartamento3 = salario;
            sD3 = (int)salarioDepartamento3;
        }

        System.out.println("El salario en el departamento 1 es: " + sD1);
        System.out.println("El salario en el departamento 2 es: " + sD2);
        System.out.println("El salario en el departamento 3 es: " + sD3);
    }
}

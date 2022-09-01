import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args){
        int a, b, c;
        double x1, x2, raiz;
        Scanner input = new Scanner(System.in); //ingresamos los datos por teclado
        System.out.println("Ingrese el valor de A: ");
        a = input.nextInt();
        System.out.println("Ingrese el valor de B: ");
        b = input.nextInt();
        System.out.println("Ingrese el valor de C: ");
        c = input.nextInt();

        raiz = Math.sqrt( (Math.pow(b, 2) - (4 * a * c) ) ); //calculamos el valor de la raiz cuadrada

        x1 = (-b + raiz)/(2*a); //hallamos las raices de la ecuación cuadratica
        x2 = (-b - raiz)/(2*a);

        /*En este caso no mandamos mensaje si el valor dentro de la raiz es negativa
        ya que java ya arroja un valor por defecto (NaN) si esto ocurre*/
        System.out.println("El primer resultado de la ecuacion es: " + x1);
        System.out.println("El segundo resultado de la ecuacion es: " + x2);
    }
}

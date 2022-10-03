/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio23;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
//        int a, b, c;
//        double x1, x2, raiz;
//        Scanner input = new Scanner(System.in); //ingresamos los datos por teclado
//        System.out.println("Ingrese el valor de A: ");
//        a = input.nextInt();
//        System.out.println("Ingrese el valor de B: ");
//        b = input.nextInt();
//        System.out.println("Ingrese el valor de C: ");
//        c = input.nextInt();
//
//        raiz = Math.sqrt( (Math.pow(b, 2) - (4 * a * c) ) ); //calculamos el valor de la raiz cuadrada
//
//        x1 = (-b + raiz)/(2*a); //hallamos las raices de la ecuación cuadratica
//        x2 = (-b - raiz)/(2*a);
//
//        /*En este caso no mandamos mensaje si el valor dentro de la raiz es negativa
//        ya que java ya arroja un valor por defecto (NaN) si esto ocurre*/
//        System.out.println("El primer resultado de la ecuacion es: " + x1);
//        System.out.println("El segundo resultado de la ecuacion es: " + x2);
        Ventana23 frm = new Ventana23();
        frm.setVisible(true);
    }
}

class Ecuacion {

    double A;
    double B;
    double C;
    double Disc;
    double X1;
    double X2;

    public static double Discriminante(double A, double B, double C) {
        double Rcst = Math.pow(B, 2) - (4 * A * C);
        return Rcst;
    }

    public static double Sol1(double A, double B, double C, double Disc) {
        double Aux1 = (-B + Math.sqrt(Disc)) / (2 * A);
        return Aux1;
    }

    public static double Sol2(double A, double B, double C, double Disc) {
        double Aux2 = (-B - Math.sqrt(Disc)) / (2 * A);
        return Aux2;
    }
}

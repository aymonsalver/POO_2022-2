/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio07;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Scanner Entrada = new Scanner(System.in);
//
//        System.out.println("Ingrese el valor de A: ");
//        double A = Entrada.nextDouble();
//
//        System.out.println("Ingrese el valor de B: ");
//        double B = Entrada.nextDouble();
//
//        if (A > B) {
//            System.out.println("A es mayor que B");
//        } else if (A == B) {
//            System.out.println("A es igual que B");
//        } else {
//            System.out.println("A es menor que B");
//        }
        Ventana07 frm = new Ventana07();
        frm.setVisible(true);

    }

}

class Comparador {

    double A;
    double B;

    public static String Comp(double A, double B) {
        String Respuesta;
        if (A > B) {
            //System.out.println("A es mayor que B");
            Respuesta = "A es mayor que B";
            return Respuesta;

        } else if (A == B) {
            //System.out.println("A es igual que B");
            Respuesta = "A es igual que B";
            return Respuesta;

        } else {
            //System.out.println("A es menor que B");
            Respuesta = "A es menor que B";
            return Respuesta;

        }

    }

}

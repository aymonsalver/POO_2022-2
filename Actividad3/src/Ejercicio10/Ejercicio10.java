/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
//        Scanner Entrada = new Scanner(System.in);
//        MatriculaTotal nuevaMatricula = new MatriculaTotal();
//
//        System.out.println("Ingrese el numero de la inscripción: ");
//        int numeroInscripcion = Entrada.nextInt();
//
//        System.out.println("Ingrese su nombre por favor: ");
//        String Nombre = Entrada.next();
//
//        System.out.println("Ingrese su patrimonio por favor: ");
//        double Patrimonio = Entrada.nextDouble();
//
//        System.out.println("Ingrese su estrato por favor: ");
//        int Estrato = Entrada.nextInt();
//
//        nuevaMatricula.Patrimonio = Patrimonio;
//        nuevaMatricula.Estrato = Estrato;
//        nuevaMatricula.Aumento = MatriculaTotal.aumento(Patrimonio);
//
//        nuevaMatricula.Numero_Inscripcion =  numeroInscripcion;
//        if (Patrimonio > 2000000 && Estrato > 3) {
//            System.out.println("El numero de la incripción es: " + nuevaMatricula.Numero_Inscripcion);
//            System.out.println("Nombre del estudiante : " + Nombre);
//            System.out.println("El valor de la matricula incrementara 3 % de  su patrimonio");
//            System.out.println("El valor de la matricula es :" + nuevaMatricula.Aumento);
//
//        } else if (Patrimonio <= 2000000 && Estrato <= 3) {
//            System.out.println("El numero de la incripción es: " + nuevaMatricula.Numero_Inscripcion);
//            System.out.println("Nombre del estudiante : " + Nombre);
//            System.out.println("El valor de la matricula es de $ 50 000 ");            
//        }
        Ventana10 frm = new Ventana10();
        frm.setVisible(true);

    }
}

class MatriculaTotal {

    String Nombre;
    double Patrimonio;
    int Numero_Inscripcion;
    int Estrato;
    double Aumento;

    public static double aumento(double Patrimonio) {
        double AumentoPatrimonio = Patrimonio * 0.03;
        AumentoPatrimonio = AumentoPatrimonio + 50000;
        return AumentoPatrimonio;
    }

}

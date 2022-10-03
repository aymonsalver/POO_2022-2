/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio40;
import java.lang.Math;
/**
 *
 * @author User
 */
public class Ejercicio40 {

    public static void main(String[] args) {
        
        Ventana40 frm = new Ventana40();
        frm.setVisible(true);
        
//        String Aja = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10";
//        String [] r = Aja.split(",");
//        for (int i=0;i<r.length;i++){
//            System.out.println(r[i]);
//        }
        
        

    }

}

class Num_Pos {
    
    int N;
    double Raiz;
    int Cuad;
    int Cubo;
    
    public static double Raiz_N(int N){
        double Root = Math.round(Math.sqrt(N) * 10);
        Root = Root/10;
        return Root;
        
    }
    
    public static int Cuad_N(int N){
        int Sqr = (int) Math.pow(N, 2);
        return Sqr;
        
    }
    
    public static int Cubo_N(int N){
        int Qbe = (int) Math.pow(N, 3);
        return Qbe;
    }

}

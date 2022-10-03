/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio41;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Ejercicio41 {
    public static void main(String[] args) {
        Ventana41 frm = new Ventana41();
        frm.setVisible(true);
        
        
    }
    
}

class Num_Pos{
    float Myr;
    ArrayList<Float> List_Num;
    
    public static float Mayor(ArrayList<Float>List_Num){
        float Comp = 0;
        for(Float N: List_Num){
            if(N>=Comp){
                Comp = N;
            }
            else{
                continue;
            }
        }
        return Comp;
    }
}

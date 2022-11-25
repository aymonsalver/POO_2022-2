/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionarchivo;

import java.util.*;

/**
 *
 * @author User
 */
public class ListaContacto {
    
    public Vector lista;
    
    public void agregarContacto(Contacto a){
        lista.add(a);
    }
    
    public String convertirTexto(){
        String texto = "";
        for (int i = 0; i<lista.size();i++){
            Contacto e = (Contacto) lista.elementAt(i);
            texto = texto + "Identificacion " + e.getIdentificacion() + "\n" + "Nombre " + e.getNombre() + "\n" + "Apellido " + e.getApellidof() + "\n---------\n";
        }
        return texto;
    }
    
}

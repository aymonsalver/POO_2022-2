/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionarchivo;

/**
 *
 * @author User
 */
public class Contacto {
    private String identificacion;
    private String nombre;
    private String apellido;
    
    public Contacto(String identificacion, String nombre, String apellido){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidof(){
        return apellido;
    }
}

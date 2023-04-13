/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author luis
 */
public class Alumno {
    
    int id;
    String nombre;
    String Apellido; 
    
    public Alumno (){
    };

    public Alumno(int id, String nombre, String Apellido) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
    
    
}

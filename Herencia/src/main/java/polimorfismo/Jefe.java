/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author luis
 */
public class Jefe extends Persona{
    
    int idJefe;
    int aniosExperiencia;
    
    public Jefe (){
   
    }

    public Jefe(int idJefe, int aniosExperiencia) {
        this.idJefe = idJefe;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Jefe(int idJefe, int aniosExperiencia, int id, String nombre, String apeliido, String domicilio, String telefono) {
        super(id, nombre, apeliido, domicilio, telefono);
        this.idJefe = idJefe;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
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

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}

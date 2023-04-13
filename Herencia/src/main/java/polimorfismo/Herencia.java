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
public class Herencia {
    
    public static void main(String[] args) {
        
        Empleado emple = new Empleado();
        emple.getNum_legajo();
        emple.getNombre();
        
        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getNombre();
        
        
        
    }
    
}

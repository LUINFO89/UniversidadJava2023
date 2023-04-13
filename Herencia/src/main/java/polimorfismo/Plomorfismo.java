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
public class Plomorfismo {

    public static void main(String[] args) {

        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
         
        Persona perso = new Persona();
        Consultor consul = new Consultor();
        
        perso = consul;

    }

}

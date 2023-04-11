/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author luis
 */
public class POO {
    
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno (5,"Luis","Soto");
        
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es : "+ alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
        alu1.setId(1);
        alu1.setNombre("Hernando");
        alu1.setApellido("Soto");
        
        System.out.println("---------------------" );

        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es : "+ alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
        
        System.out.println("---------------------" );

        // modificador de id conset
        alu2.setId(2);
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es : "+ alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
    }
    
}

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
public class Encapsulamiento {
    public static void main(String[] args) {
        
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15,"LUIS","SOTO");
        
        System.out.println("id:" + alu2.getId());
        System.out.println("Nombre: " + alu2.getNombre());
        System.out.println("Apeliido: " + alu2.getApellido());
    }
}

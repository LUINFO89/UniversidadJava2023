

package com.mycompany.javapruebajpa;

import com.mycompany.javapruebajpa.logica.Alumno;
import com.mycompany.javapruebajpa.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;
//import com.mycompany.javapruebajpa.persistencia.ControladoraPersistencia;

public class JavaPruebaJPA {

    public static void main(String[] args) {
        //ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        Controladora control  = new Controladora();
        /*Alumno alu = new Alumno(15,"Luis","Soto",new Date());
        control.crearAlumno(alu);
        //control.eliminarAlumno(15);
       /* alu.setApellido("Mesa");
        control.editarAlumno(alu);*/
        
        Alumno alu = control.traerAlumno(15);
        System.out.println("--------Busqueda Individual--------");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("--------Busqueda de todos ----------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        
        for (Alumno al : listaAlumnos){
            System.out.println("El Alumno es: " + al.toString());
        }
        
        System.out.println("-----------------------");
       
       
        
    }
    
    
}

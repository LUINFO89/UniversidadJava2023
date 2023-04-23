package com.mycompany.javapruebajpa.logica;

import com.mycompany.javapruebajpa.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {
    //contiene los meotodos 

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }
    
    

    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }

    
     public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
     
     
     public Alumno traerAlumno(int id){
         return controlPersis.traerAlumno(id);
     }
     
     public ArrayList<Alumno> traerListaAlumnos(){
         return controlPersis.traerListaAlumnos();
     }
}

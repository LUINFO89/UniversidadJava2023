package com.mycompany.javapruebajpa.persistencia;

import com.mycompany.javapruebajpa.logica.Alumno;
import com.mycompany.javapruebajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AlumnoJpaController aluJpa = new AlumnoJpaController();
    
    //se conect con controladora

    public void crearAlumno(Alumno alu) {

            aluJpa.create(alu);

    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Alumno traerAlumno(int id) {

        return aluJpa.findAlumno(id);

    }

    public ArrayList<Alumno> traerListaAlumnos() {
            
            List<Alumno> lista = aluJpa.findAlumnoEntities();
            ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(lista);
        return listaAlumnos;
    }
    
   
    
}

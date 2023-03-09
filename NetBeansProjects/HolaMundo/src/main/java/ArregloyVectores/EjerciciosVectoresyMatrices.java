package ArregloyVectores;

import java.util.Scanner;

public class EjerciciosVectoresyMatrices {

    public static void main(String[] args) {
        //EJERCICIOS VECTORES

        //Realizar un programa que permita cargar 15 numeros en un vector,Una vez cargados , se necesita que el programa cuente
        // e informe por pantalla cùantas veces cargo el numero 5
        /*
        int vector [] = new int [15];
        Scanner teclado = new Scanner (System.in);

        //cargar nuestro vector

        for (int i = 0; i < 15; i++) {

            System.out.println("Ingrese un nùmero para el vector de posicion " + i);
            System.out.println("____________________________");
            vector[i] = teclado.nextInt();
        }

        // recorrer y contar cuantos numeros hay

        int cont = 0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3){
                cont = cont + 1 ;
            }
        }

        System.out.println("La cantidad de numneros 3 que hay en el vector es: " + cont);

        */
        //Ejercicios Matrices

        //En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria. Cada fila corresponde a las notas
        //y al promedio de cada alumno.
        //Se necesita un programa que permita a un profesor cargar , en las 3 posiciones ( columnas ) de cada fila , las notas del alumno
        //y que en la ultima columna se calculen los promedios.
        //Una vez realizados los calculos, se desea mostrar 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.

        Double matriz [][] = new Double [4][4];
        Scanner teclado = new Scanner(System.in);
        Double suma = 0.0 ;

        //for para cargar las notas de los alumnos

        for (int i = 0; i < 4  ; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.println("Ingrese la calificacion del alumno Nª " + i);
                matriz[i][j] = teclado.nextDouble();
                suma = suma + matriz[i][j];
            }
            matriz[i][3] = suma /3;
            suma = 0.0;
        }
        //for para recorrer
        for (int i = 0; i < 4; i++) {
            System.out.println("Las notas del alumno: " + i + " son: ");
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota Nª " + j + " " + matriz[i][j]);
            }
            System.out.println("EL promedio de las notas es: " + matriz[i][3]);
        }




    }
    }




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArregloyVectores;

import java.util.Scanner;

/**
 *
 * @author luis-dev
 */
public class VectorUnidimencional {

    public static void main(String[] args) {
        System.out.println("Arreglos Unidimencionales");

        //Declaracion
        int vector[] = new int[4];

        //Aasignacion (manual)
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 157;

        //Recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el idice: " + i);

            System.out.println("Estoy recorriendo el Vector: " + vector[i]);

            System.out.println("-------------------");
        }

        System.out.println("ARREGLOS Bidimencionales");

        int matriz[][] = new int[3][3];

        //Asignacion Manual de la Matriz
        /*matriz[0][0] = 2;
        matriz[0][1] = 13;
        matriz[0][2] = 96;
        matriz[1][0] = 36;
        matriz[1][1] = 35;
        matriz[1][2] = 33;
        matriz[2][0] = 45;
        matriz[2][1] = 895;
        matriz[2][2] = 236;
        */
        // Cargar por teclado la matriz
        
        Scanner teclado = new Scanner (System.in);
       
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("Ingrese el valor de la posicion f: "+ f + " c: "+c);
                matriz[f][c] =teclado.nextInt();
            }
        }

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("Estoy en la fila: " + f + "y en la columna:  " + c);
                System.out.println("Los valores almacenados en la matriz son: " + matriz[f][c]);
            }
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[5];
        double[][] produccion = new double[5][12];
        double[] sumaTotal = new double[5];
        String nombre;
        String reporte = "";
        double suma;
        double produccionValor;

        for (int i = 0; i < produccion.length; i++) {

            System.out.println("Ingrese le nombre del encargado");
            nombre = entrada.nextLine();
            nombres[i] = nombre;
            System.out.println("Encargado " +nombre);
            for (int j = 1; j <= produccion[i].length; j++) {
                System.out.println("mes " + j);
                System.out.println("Ingrese la producción del mes");
                produccionValor = entrada.nextDouble();
                produccion[i][j] = produccionValor;

                entrada.nextLine();
            }

        }
        for (int i = 0; i < produccion.length; i++){
            suma = 0;
            for (int j = 0; j < produccion[i].length; j++){
                suma = suma + produccion[i][j];
            }
            sumaTotal[i] = suma;         
        
        }
        
        for (int i = 0; i < nombres.length; i++){
            reporte = String.format("", )
        }

    }

}

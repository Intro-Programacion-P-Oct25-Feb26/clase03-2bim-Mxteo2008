package paquete05;

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] nombres = new String[5];
        double[][] produccion = new double[5][12];
        double[] sumaTotal = new double[5];
        String nombre;
        double produccionValor;
        String reporte = String.format("Análisis de Producción\n");

     
        for (int i = 0; i < produccion.length; i++) {
            System.out.printf("Ingrese el nombre del encargado de la estación "
                    + "%d:\n", i + 1);
            nombre = entrada.nextLine();
            nombres[i] = nombre;

            for (int j = 0; j < produccion[i].length; j++) {
                System.out.printf("Mes %d - Ingrese la producción en "
                        + "dólares:\n", j + 1);
                produccionValor = entrada.nextDouble();
                produccion[i][j] = produccionValor;
            }
            entrada.nextLine();
        }

        double maximo = 0;
        int indiceMaximo = 0;

        for (int i = 0; i < produccion.length; i++) {
            double suma = 0;
            for (int j = 0; j < produccion[i].length; j++) {
                suma = suma + produccion[i][j];
            }
            sumaTotal[i] = suma;

            reporte = String.format("%sEstacion %s - %s - Total Producción: "
                    + "$%.2f\n", reporte, i +1, nombres[i], suma);

            if (suma > maximo) {
                maximo = suma;
                indiceMaximo = i;
            }
        }
        reporte = String.format("%s%nEstación más productiva: Estación "
                + "%d%nEncargado "
                + "de la estación: %s%nCantidad de la estación más productiva: "
                + "$%.2f\n", reporte, indiceMaximo + 1, nombres[indiceMaximo],
                maximo);

        System.out.println(reporte);
    }
}

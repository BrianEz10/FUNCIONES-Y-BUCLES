package FUNCIONYBUCLES;

import java.util.Scanner;

public class IngresosMensuales {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        int calucalarIngresosMensuales;
        int[] ventas = new int[31];
        int i = 1;

        System.out.println("Bienvenido");
        System.out.println("Ingrese la cantidad de ventas, de los ultimos 30 dias");

        for (i = 1;i < 31;i++){
            System.out.println(("Ventas dia "+ i));
            ventas[i] = Entrada.nextInt();
        }
        calucalarIngresosMensuales = suma(ventas);
        System.out.println("Usted el ultimo tuvo una ganacia total de "+calucalarIngresosMensuales+" dolares");
    }

    public static int suma(int[] array){
        int c = 0;
        int o = 0;

        for (o = 0;o <array.length;o++){
            c = c + array[o];
        }
        return c;
    }
}
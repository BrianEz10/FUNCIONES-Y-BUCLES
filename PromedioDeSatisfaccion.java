package FUNCIONYBUCLES;

import java.util.Scanner;

public class PromedioDeSatisfaccion {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        int numeroClientes;

        System.out.println("Promedio de satisfaccion de clientes");
        System.out.println("Ingrese la cantidad de clientes para asi crear un promedio");
        numeroClientes = Entrada.nextInt();
        int[] calificaciones = new int[numeroClientes];


        calcularPromedioSatisfaccion(numeroClientes, calificaciones);

    }

    public static void calcularPromedioSatisfaccion(int numeroClientes, int[] calificaciones) {

        Scanner Input = new Scanner(System.in);
        int i = 1;
        int promedioSuma = 0;
        int promedio;

        System.out.println("Ingrese una puntuacion del 1 al 5 el nivel de satisfaccion");
        for (i = 1; i < numeroClientes + 1; i++) {
            System.out.println("Empleado Numero " + i);
            calificaciones[i - 1] = Input.nextInt();
            promedioSuma = promedioSuma + calificaciones[i - 1];
        }
        promedio = (int) (promedioSuma / numeroClientes);

        System.out.println("Escala de Satisfaccion \n1: Muy Malo \n2: Malo \n3: Regular \n4: Bueno \n5: Excelente ");
        System.out.println("El promedio es de " + promedio);
        switch (promedio) {
            case 1: {
                System.out.println("Muy Malo");
                break;
            }
            case 2: {
                System.out.println("Malo");
                break;
            }
            case 3:{
                System.out.println("Regular");
                break;
            }
            case 4:{
                System.out.println("Bueno");
                break;
            }
            case 5:{
                System.out.println("Excelente");
                break;
            }
        }
    }
}
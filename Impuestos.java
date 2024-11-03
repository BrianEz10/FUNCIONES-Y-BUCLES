package FUNCIONYBUCLES;

import java.util.Scanner;

public class Impuestos {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        int contadorClientes = 0;
        int i = 1;

        System.out.println("Ingrese la cantidad de facturas");
        contadorClientes = Entrada.nextInt();

        int[]facturas = new int[contadorClientes];

        for (i = 1; i<contadorClientes+1;i++){
            System.out.println("Ingrese el monto de la factura del cliente Numero "+i);
            facturas[i-1] = Entrada.nextInt();
        }
        System.out.println("-----------------------------------------------------");
        calcularImpuesto(facturas,contadorClientes);
        System.out.println("Hasta Luego");
    }
    public static void calcularImpuesto(int[]facturas,int contadorClientes){

        Scanner Entradin = new Scanner(System.in);
        int iterador = 1;

        int totalFinal = 0;
        int impuesto = 0;

        for (iterador = 1;iterador<contadorClientes+1;iterador++){
            System.out.println("Se le incluye impuestos del 21% al cliente numero "+iterador);
            System.out.println("Factura sin impuestos Agregados : "+facturas[iterador-1]);
            impuesto = (int) (facturas[iterador-1]*0.21);
            totalFinal = (int) (facturas[iterador-1]+impuesto);

            System.out.println("Factura con impuestos agregados "+totalFinal);
            System.out.println("-----------------------------------------------------");
        }
    }
}

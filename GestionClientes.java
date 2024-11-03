package FUNCIONYBUCLES;

import java.util.Scanner;

public class GestionClientes {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        String[] clientes = new String[4];
        int[]facturasPendientes  = new int[4];
        int i = 1;

        System.out.println("Gestion de Clientes");
        System.out.println("Ingrese la lista de los clientes");
        for (i = 1;i<4;i++){
            System.out.println("Ingrese el nombre del cliente Nª"+i);
            clientes[i-1] = Entrada.nextLine();
            System.out.println("Ingrese el monto de la factura de "+clientes[i-1]);
            facturasPendientes[i-1] = Entrada.nextInt();
            Entrada.nextLine();
        }
        enviarFacturas(clientes,facturasPendientes);

    }
    public static void enviarFacturas(String[]clientes,int[]facturasPendientes){
        int iterador = 0;
        for (iterador = 0; iterador < 3;iterador++){
            if(facturasPendientes[iterador]>500){
                System.out.println("El cliente "+clientes[iterador]+" tiene una factura mayor de $500");
            }
        }

    }
}
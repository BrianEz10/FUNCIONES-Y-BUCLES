package FUNCIONYBUCLES;

import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

public class DescuentosFidelizacion {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        int cantidadClientes = 0;
        int i = 0;

        System.out.println("Ingrese la cantidad de clientes");
        cantidadClientes = Entrada.nextInt();
        String[]clientes = new String[cantidadClientes];
        int[]compras = new int[cantidadClientes];
        Entrada.nextLine();

        for (i = 0;i<cantidadClientes;i++){
            System.out.println("Ingrese el nombre de sus clientes");
            clientes[i] = Entrada.nextLine();
            System.out.println("Ingrese la cantidad de productos que compro "+clientes[i]);
            compras[i] = Entrada.nextInt();
            Entrada.nextLine();
        }
        calcularDescuentos(clientes,compras,cantidadClientes);
    }
    public static void calcularDescuentos(String[]clientes,int[]compras,int cantidadClientes){
        Scanner Entradin = new Scanner(System.in);
        int iterador = 0;
        double descuento;
        double totalDescuento;

        int total;

        for(iterador = 0;iterador < cantidadClientes;iterador++){
            if (compras[iterador] > 10){
                System.out.println("El comprador "+clientes[iterador]+" a aplicado para obtener un 10% de descuento para sus compras");
                System.out.println("Ingrese el total de lo gastado");
                total = Entradin.nextInt();
                descuento = (double) (total*0.10);
                totalDescuento = (double) (total-descuento);

                System.out.println("Se aplico su descuento y el total de su compra ahora es "+totalDescuento+" pesos");
            }else{
                System.out.println("El cliente "+clientes[iterador]+" no accedio al descuento, por pocas compras");
            }
        }
    }
}

package FUNCIONYBUCLES;

import java.util.Scanner;

public class ComprasGrandes {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int prendasCompradas;
        int i = 1;

        System.out.println("¿Cuantas prendas a comprado?");
        prendasCompradas = Entrada.nextInt();
        Entrada.nextLine();

        String[]nombrePrenda = new String[prendasCompradas];
        int[]precioPrenda = new int[prendasCompradas];

        for(i = 1; i < prendasCompradas+1; i++){
            System.out.println("Ingrese el nombre de la prenda Nº "+i);
            nombrePrenda[i-1] = Entrada.nextLine();
            System.out.println("Ingrese el precio de la prenda");
            precioPrenda[i-1] = Entrada.nextInt();
            Entrada.nextLine();
        }
        System.out.println("Se verificaran si hay descuentos disponibles");
        System.out.println("-----------------------------------------------------");
        aplicarDescuento(prendasCompradas,nombrePrenda,precioPrenda);
    }
    public static void aplicarDescuento(int prendasCompradas,String[]nombrePrenda,int[]precioPrenda){
        int i = 1;
        int descuento;
        int descuentoFinal;

        for (i = 1; i < prendasCompradas; i++){
            if (precioPrenda[i-1]>500){
                System.out.println("La prenda "+nombrePrenda[i-1]+" tiene un descuento de un 15%");
                System.out.println("Precio anterior "+precioPrenda[i-1]);
                descuento = (int) ((precioPrenda[i-1])*0.15); //el 0.15 es el Descuento
                descuentoFinal = (int) ((precioPrenda[i-1])-descuento);
                System.out.println("Precio Actual con descuento "+descuentoFinal);
                System.out.println("-----------------------------------------------------");
            }
        }
    }
}
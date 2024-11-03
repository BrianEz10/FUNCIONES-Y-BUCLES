package FUNCIONYBUCLES;

import java.util.Scanner;

public class Invierno {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        String[] electronica = new String[6];
        int[] stock = new int[6];
        int i = 1;

        System.out.println("Generador de reportes");
        System.out.println("Ingrese 5 productos que vendan con frecuencia y su stock actual");
        for (i = 1;i < 6;i++){
            System.out.println("Ingrese el nombre del numero "+i);
            electronica[i] = Entrada.nextLine();
            System.out.println("Ingrese el stock actual de "+electronica[i]);
            stock[i] = Entrada.nextInt();
            Entrada.nextLine();

        }

        generarReporteBajoStock(electronica,stock);

    }
    public static void generarReporteBajoStock(String[] electronica, int[] stock){

        int i = 1;

        for (i = 1;i < 6;i++){
            if (stock[i] < 5){
                System.out.println("Hay que comprar mas productos de "+electronica[i]);
            }
        }
    }
}
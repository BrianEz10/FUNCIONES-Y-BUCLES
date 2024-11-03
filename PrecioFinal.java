package FUNCIONYBUCLES;

import java.util.Scanner;

public class PrecioFinal {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int i = 0;
        int cantidadProductos;
        System.out.println("Ingrese cuantos productos tiene");
        cantidadProductos = Entrada.nextInt();
        Entrada.nextLine();
        String[]nombreProducto = new String[cantidadProductos];
        int[]preciosOriginales = new int[cantidadProductos];
        System.out.println("Ingrese el nombre y el precio original del producto");
        for (i = 0;i<cantidadProductos;i++){
            System.out.println("Nombre:");
            nombreProducto[i] = Entrada.nextLine();
            System.out.println("Precio Original");
            preciosOriginales[i] = Entrada.nextInt();
            Entrada.nextLine();
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Precios Actualizados");
        calcularPrecioFinal(cantidadProductos,nombreProducto,preciosOriginales);
    }
    public static void calcularPrecioFinal(int cantidadProductos,String[]nombreProducto,int[]preciosOriginales){
        double descuento = 0.10;
        int i = 0;
        int descuentoFinal;
        for (i = 0;i<cantidadProductos;i++){
            System.out.println("Nombre del producto "+nombreProducto[i]+"\nPrecio Actual del Producto: "+preciosOriginales[i]);
            descuentoFinal = (int) (preciosOriginales[i]-(preciosOriginales[i]*descuento));
            System.out.println("Precio Actulizado con 10% de descuento "+descuentoFinal);
            System.out.println("-----------------------------------------------------");
        }

    }
}

package FUNCIONYBUCLES;

import java.util.Scanner;

public class HorasTrabajadas {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int i = 0;
        int cantidadEmpleados;

        System.out.println("Ingrese cuantos empleados tiene contratados");
        cantidadEmpleados = Entrada.nextInt();
        Entrada.nextLine();
        String[]nombreEmpleados = new String[cantidadEmpleados];
        int[]horasTrabajadas = new int[cantidadEmpleados];
        System.out.println("Ingrese el nombre de sus empleados y sus horas trabajadas esta semana");
        for (i = 0;i<cantidadEmpleados;i++){
            System.out.println("Nombre: ");
            nombreEmpleados[i] = Entrada.nextLine();
            System.out.println("Horas de "+nombreEmpleados[i]);
            horasTrabajadas[i] = Entrada.nextInt();
            Entrada.nextLine();
        }
        System.out.println("-----------------------------------------------------");
        calcularPagoSemanal(cantidadEmpleados,nombreEmpleados,horasTrabajadas);
    }
    public static void calcularPagoSemanal(int cantidadEmpleados,String[]nombreEmpleados,int[]horasTrabajadas){
        int i = 0;
        int salario;
        int pagoHora = 15;
        for (i = 0;i<cantidadEmpleados;i++){
            if (horasTrabajadas[i]<=0){
                System.out.println("Nombre: "+nombreEmpleados[i]+"\nHoras Trabajadas: "+horasTrabajadas[i]+"\nPago por Hora: $15 \nPago Semanal: $0");
                System.out.println("-----------------------------------------------------");
            } else if (horasTrabajadas[i]>0) {
                salario = (int) ((horasTrabajadas[i])*pagoHora);
                System.out.println("Nombre: "+nombreEmpleados[i]+"\nHoras Trabajadas: "+horasTrabajadas[i]+"\nPago por Hora: $15 \nPago Semanal: $"+salario);
                System.out.println("-----------------------------------------------------");
            }
        }
    }
}

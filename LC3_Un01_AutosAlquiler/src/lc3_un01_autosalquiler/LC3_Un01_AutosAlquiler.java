package lc3_un01_autosalquiler;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */

/*
---------------------------------------
Guía de Ejercicios Un. 1 - POO - Ej: 7
---------------------------------------
7. Una empresa de alquiler de autos cobra $300 por día si no se superan los 
200 km de uso diario. Por cada km extra hasta los 1000 km cobra $5 adicionales,
y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite la
cantidad de km realizados por un cliente e indique el importe que se le debe cobrar. 
*/
public class LC3_Un01_AutosAlquiler {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int kmsRecorridos = 0, kmsExtra = 0;
        int costoExtra = 0;
        int total = 300;
        
        System.out.println("Empresa de Alquiler de Autos");
        System.out.println("----------------------------");
        //SOLICITAMOS INGRESO AL USUARIO
        System.out.print("Ingrese la cantidad de kms. recorridos -> ");
        kmsRecorridos = teclado.nextInt();

        if (kmsRecorridos > 200) {
            if (kmsRecorridos > 1000) {
                kmsExtra = kmsRecorridos - 1000;
                costoExtra += kmsExtra * 10;
                System.out.println("Kms excedidos de 1000: " + kmsExtra);
                System.out.println("Extra $" + costoExtra);
            }

            kmsExtra = kmsRecorridos - 200 - kmsExtra;
            costoExtra += kmsExtra * 5;
            System.out.println("Kms excedidos de 200: " + kmsExtra);
            System.out.println("Extra $" + costoExtra);
        }        
        
        //ACUMULAMOS LAS VARIABLES Y MOSTRAMOS
        total += costoExtra;
        System.out.println("\nEl costo total a abonar es $" + total);
                
    }

}

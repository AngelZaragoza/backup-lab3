package lc3_un01_autosalquiler;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
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

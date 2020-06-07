package lc3_un01_concesautos;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */

/*
---------------------------------------
Guía de Ejercicios Un. 1 - POO - Ej: 12
---------------------------------------
12. Desarrollar un programa que permita ingresar la antigüedad los autos de 
una concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada auto 
ingresado mostrar por pantalla un mensaje adecuado con el siguiente criterio:
si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”,
si tiene entre 6 y 10 mostrar “POCO USO”,
si tiene entre 11 y 20 “MUCHO USO”
y si tiene más de 20 “MUY ANTIGUO”. 
Luego de finalizada la carga calcular y mostrar los siguientes resultados: 
• Cantidad total de autos. 
• Cantidad de autos con poco uso. 
• Promedio de antigüedad de los autos que no sean muy antiguos.
*/
public class LC3_Un01_ConcesAutos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int antig;
        int acumAntig = 0;
        int autosTotal = 0;
        int pocoUsoAutos = 0;
        int muyAntiguoAutos = 0;
        //int promNoAntiguos = 0.0f;

        System.out.println("Concesionario de Autos Usados");
        System.out.println("-----------------------------");
        //SOLICITAMOS INGRESO AL USUARIO
        System.out.print("Ingrese la antigüedad en años. 0 para terminar -> ");
        antig = teclado.nextInt();

        while (antig != 0) {
            autosTotal++;
            acumAntig += antig;
            if (antig >= 1 && antig <= 5) {
                System.out.println("NUEVO");
            } else
                if (antig >= 6 && antig <= 10) {
                    System.out.println("POCO USO");
                    pocoUsoAutos++;
                } else
                    if (antig >= 11 && antig <= 20) {
                        System.out.println("MUCHO USO");
                    } else {
                        System.out.println("MUY ANTIGUO");
                        muyAntiguoAutos++;
                        //RESTAMOS DEL ACUMULADOR LA ANTIGUEDAD DEL AUTO ANTIGUO
                        //PARA QUE NO AFECTE EL CALCULO DEL PROMEDIO
                        acumAntig -= antig;
            }
            //PEDIMOS DATOS DE NUEVO SINO NO SALDRIA NUNCA DEL LOOP
            System.out.print("Ingrese la antigüedad en años -> ");
            antig = teclado.nextInt();
        }

        System.out.println("\nInformación:");
        System.out.println("-------------");
        System.out.println("TOTAL de autos cargados: " + autosTotal);
        System.out.println("Autos con POCO USO: " + pocoUsoAutos);
        System.out.println("Promedio de antigüedad autos NO ANTIGUOS: "
                + (float)acumAntig / (autosTotal - muyAntiguoAutos));

    }

}

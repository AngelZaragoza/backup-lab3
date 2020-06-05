package lc3_un01_guiaestructurada_varios;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Un01_GuiaEstructurada_varios {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;     
        
        
        do {            
            System.out.println("Menú de opciones:");
            System.out.println("-----------------");
            System.out.println("2 -- Cálculo de Precio + IVA");
            System.out.println("5 -- Cálculo de Sueldo");
            System.out.println("6 -- Cálculo de Año Bisiesto");
            System.out.println("8 -- Suma y Promedio de 10 números");
            System.out.println("10 - Verificación de número positivo");
            System.out.println("0 -- Salir");
            System.out.print("Ingrese opción -> ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 2:
                    System.out.print("Ingrese el precio del artículo -> ");
                    precioIVA(teclado.nextFloat());                    
                    break;
                case 6:
                    System.out.print("Ingrese el año a evaluar -> ");
                    anioBisiesto(teclado.nextInt());
                    break;
                case 0:
                    System.out.println("Programa terminado");
                    break;
                default:
                    System.out.println("** Opción inválida **");
            }
            if (opcion != 0)
            {
                System.out.print("Enter para continuar...");
                teclado.nextLine();
                teclado.nextLine();
            }
            
        } while (opcion != 0);
        
        


    }
    
    public static void precioIVA(float precio)
    {   
        //System.out.println("21% IVA: $" + precio*0.21);
        System.out.println("21% IVA: $" + String.format("%.2f", precio*0.21));
               
        //System.out.println("Precio + IVA: $" + precio*1.21);
        System.out.println("21% IVA: $" + String.format("%.2f", precio*1.21));
    }
    
    public static void anioBisiesto(int anio)
    {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año ingresado ES BISIESTO");
        } else {
            System.out.println("El año ingresado NO ES BISIESTO");
        }
    }
    
}

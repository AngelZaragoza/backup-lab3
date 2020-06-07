package lc3_un01_guiaestructurada_varios;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */

/*
---------------------------------------------
Guía de Ejercicios Un. 1 - Prog. Estructurada
Ejercicios: 2 - 5 - 6 - 8 - 9 - 10 - 11
---------------------------------------------
*/
public class LC3_Un01_GuiaEstructurada_varios {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //Instancia objeto con métodos que resuelven algunos de los ejercicios
        Auxiliar ejercicio = new Auxiliar();
        
        int opcion;
        
        
        do {            
            System.out.println("Menú: Ejercicios varios de la Guía 1");
            System.out.println("-----------------");
            System.out.println("2 -- Cálculo de Precio + IVA");
            System.out.println("5 -- Cálculo de Sueldo");
            System.out.println("6 -- Cálculo de Año Bisiesto");
            System.out.println("8 -- Suma y Promedio de 10 números");
            System.out.println("9 -- Cantidad de números mayores a 5");
            System.out.println("10 - Verificación de número positivo");
            System.out.println("11 - Clasificación de Fórmula 1");
            System.out.println("0 -- Salir");
            System.out.print("Ingrese opción -> ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 2:
                    System.out.print("Ingrese el precio del artículo -> ");                    
                    ejercicio.precioIVA(teclado.nextFloat());
                    break;
                    
                case 5:
                    System.out.print("Ingrese Cant. de Horas -> ");
                    int horas = teclado.nextInt();
                    System.out.print("Ingrese Sueldo por Hora -> ");
                    float sueldoHora = teclado.nextFloat();
                    float total = ejercicio.calculoSueldo(horas, sueldoHora);
                    System.out.println("Sueldo total: $" + total);                    
                    break;
                    
                case 6:
                    System.out.print("Ingrese el año a evaluar -> ");
                    ejercicio.anioBisiesto(teclado.nextInt());
                    break;
                    
                case 8:
                    int suma = 0;
                    float prom = 0f;
                    System.out.println("Ingrese 10 números:");
                    suma = ejercicio.sumaDiezNros();                    
                    prom = (float)suma / 10;
                    
                    System.out.println("Suma de los 10 nros. ingresados: " + suma);
                    System.out.println("Promedio de los 10 nros ingresados: " + prom);
                    break;
                case 9:
                    int n, cant;
                    System.out.print("Ingrese la cantidad de números -> ");
                    n = teclado.nextInt();                    
                    System.out.println("Ingrese " + n + "números:");
                    cant = ejercicio.cantMayorACinco(n);
                    
                    System.out.println("Se ingresaron " + cant +
                                        " números mayores a 5.");
                    break;
                    
                case 10:
                    ejercicio.numeroPositivo();
                    break;
                    
                case 11:
                    System.out.print("Tiempo (en segundos) del ganador de la clasificación -> ");
                    float mejorTiempo = teclado.nextFloat();
                    System.out.println("Tiempo (en segundos) de los restantes 9 corredores:");
                    int clasif = ejercicio.corredoresClasificados(mejorTiempo);
                    
                    System.out.println("Corredores clasificados: " + clasif);                    
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
    
}
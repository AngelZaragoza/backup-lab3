
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

public class Auxiliar {
    private Scanner teclado;
    
    //CONSTRUCTOR
    public Auxiliar() {
        teclado = new Scanner(System.in);
    }
    
    //METODOS
    //Calcula y muestra un precio dado + IVA
    public void precioIVA(float precio)
    {   
        float iva = precio * 0.21f;       
        
        //Al mostrar por consola, el iva se muestra con muchos decimales
        //System.out.println("21% IVA: $" + iva);
        
        //Por ello usamos String.format para "formatear" la salida
        System.out.println("21% IVA: $" + String.format("%.2f", iva));
        
        //System.out.println("Precio + IVA: $" + precio*1.21);
        System.out.println("Precio + IVA: $" + String.format("%.2f", precio + iva));
    }
    
    //Calcula y devuelve sueldo más horas extra
    public float calculoSueldo(int horas, float sueldoHora) {
        float sueldoTotal = 0f;
        float horasExtra = 0f;
        
        if (horas > 180) {
            horasExtra = (horas - 180)*(sueldoHora * 1.5f);
        }        
        sueldoTotal = 180*sueldoHora + horasExtra;
        
        return sueldoTotal;
    }
    
    //Calcula e informa si el año pasado por parámetro es bisiesto
    public void anioBisiesto(int anio)
    {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año ingresado ES BISIESTO");
        } else {
            System.out.println("El año ingresado NO ES BISIESTO");
        }
    }
    
    
    //Devuelve un sufijo para indicar ordinalidad en números. Estético
    private String sufijoNro(int nro) {
        String sufijo;
        nro = nro % 10;
        //Si el resto(módulo) de la operación de arriba es 1 o 3,
        //devuelve "er", sino, devuelve "º"
        sufijo = (nro == 1 || nro == 3)? "er":"º";        
        return sufijo;
    }
    
    //Pide 10 números por teclado y devuelve su suma
    public int sumaDiezNros() {        
        int suma = 0;
        for (int i = 1; i <= 10; i++) {            
            System.out.print(i + sufijoNro(i) + " Nro. -> ");
            suma += teclado.nextInt();                        
        }        
        return suma;
    }
    
    //Pide una cantidad especificada de nros. por teclado y devuelve un contador
    public int cantMayorACinco(int cantNros) {        
        int cont = 0;
        for (int i = 1; i <= cantNros; i++) {
            System.out.print(i + sufijoNro(i) + " Nro. -> ");
            int nro = teclado.nextInt();
            if (nro > 5 )
                cont++;
        }
        
        return cont;
    }
    
    //Pide ingreso de números hasta que el ingreso sea Positivo
    public void numeroPositivo() {
        float nro;
        boolean posi = false;
        do {
            System.out.print("Ingrese el Nro. a evaluar -> ");
            nro = teclado.nextFloat();
            if (nro > 0) {
                System.out.println("\tEl Nro. ingresado es Positivo.");
                posi = true;
            } else {
                System.out.println("\tNO Positivo. Intente de nuevo...");
            }
                
        } while (!posi);
        
    }
    
    //Pide ingreso de tiempos y compara con el mejor para contar clasificados.
    public int corredoresClasificados(float mejorTiempo) {
        int cant = 0;
        for (int i = 1; i < 10; i++) {
            System.out.print(i + sufijoNro(i) +" corredor -> ");
            float tiempo = teclado.nextFloat();
            if (tiempo < mejorTiempo * 1.15 )
                cant++;
        }
        
        return cant;
    }
}

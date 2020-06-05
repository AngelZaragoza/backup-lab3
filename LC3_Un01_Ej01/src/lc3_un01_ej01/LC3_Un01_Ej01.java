package lc3_un01_ej01;

import java.util.Scanner;

/**
 *
 * @author Angel Gabriel Zaragoza
 */
public class LC3_Un01_Ej01 {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int a, b;
        
        //TAREA - PRIMER PUNTO
        System.out.println("Hola Mundo!");
        System.out.println("-------------\n");
        
        //TAREA - SEGUNDO PUNTO
        //PEDIMOS INGRESOS
        System.out.print("Ingrese el primer número -> ");
        a = ent.nextInt();
        System.out.print("Ingrese el segundo número -> ");
        b=ent.nextInt();
        
        int suma, resta, producto;
        float cociente;
        
        //HACEMOS OPERACIONES
        suma = a + b;
        resta = a - b;
        producto = a * b;
        cociente = (float)a / b;
        
        //MOSTRAMOS RESULTADOS
        System.out.println("La suma es " + suma);
        System.out.println("La diferencia es " + resta);
        System.out.println("El producto es " + producto);
        System.out.println("El cociente es " + cociente);
    }
    
}

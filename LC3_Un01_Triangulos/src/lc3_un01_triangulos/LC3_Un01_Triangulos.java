
package lc3_un01_triangulos;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Un01_Triangulos {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Primero un objeto de prueba vacío
        Triangulo prueba = new Triangulo();
        System.out.println("1er Triángulo: " + prueba);
        System.out.println("Perímetro: " + prueba.calcPerimetro());
        System.out.println(prueba.muestraPerimetro());
        System.out.println("");
        
        //Ingresamos los datos directo con los métodos SET
        System.out.print("Ingrese el lado A -> ");
        prueba.setLadoA(teclado.nextInt());
        System.out.print("Ingrese el lado B -> ");
        prueba.setLadoB(teclado.nextInt());
        System.out.print("Ingrese el lado C -> ");
        prueba.setLadoC(teclado.nextInt());
        System.out.println("Perímetro 1er triángulo:" + prueba.calcPerimetro());
        System.out.println(prueba.muestraPerimetro());
        System.out.println("");
        
        //Ahora un objeto de prueba de constructor con parámetros
        Triangulo prueba2 = new Triangulo(3,5,7);
        System.out.println("2do Triángulo: " + prueba2);
        System.out.println("Perímetro: " + prueba2.calcPerimetro());
        System.out.println(prueba2.muestraPerimetro());
        System.out.println("");
        
        //Ahora pedimos datos al usuario
        System.out.print("Ingrese el lado A -> ");
        int a = teclado.nextInt();
        System.out.print("Ingrese el lado B -> ");
        int b = teclado.nextInt();
        System.out.print("Ingrese el lado C -> ");
        int c = teclado.nextInt();
        
        Triangulo prueba3 = new Triangulo(a,b,c);
        System.out.println("3er Triángulo: " + prueba3);
        System.out.println("Perímetro:" + prueba3.calcPerimetro());
        System.out.println(prueba2.muestraPerimetro());
        
    }
    
}

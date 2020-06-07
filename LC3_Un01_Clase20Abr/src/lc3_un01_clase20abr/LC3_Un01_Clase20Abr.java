package lc3_un01_clase20abr;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
/*
---------------------------------------
Guía de Ejercicios Un. 1 - POO - Ej: 1
---------------------------------------
1.  Agregar  a  la  clase  persona  un método  que  retorne  su  índice  de masa 
corporal. Este último dato se calcula como: 

IMC = peso / altura2 
*/

public class LC3_Un01_Clase20Abr {
    
    
    public static void main(String[] args) {
                
        Persona p;
        p = new Persona();
        
        p.setNombre("Angel");
        p.setApellido("Zaragoza");
        p.setDni(21344566);
        
        System.out.println(p.getNombre());
        System.out.println(p.getApellido());
        
        
        //CREAMOS OTRO OBJETO PARA ASIGNAR VALORES INGRESADOS POR EL USUARIO
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String apellido;
        int dni;
        int anioNac;
        
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        
        System.out.print("Ingrese el apellido: ");
        apellido = teclado.nextLine();
        
        System.out.print("Ingrese el DNI: ");
        dni = teclado.nextInt();
        
        System.out.print("Ingrese el Año de Nacimiento: ");
        anioNac = teclado.nextInt();
        
        Persona p1 = new Persona(nombre, apellido, dni, anioNac);
        p1.setPeso(90);
        p1.setAltura(1.9);
        
        System.out.println(p1);
        
    }
    
}

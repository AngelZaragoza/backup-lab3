package lc3_un01_clase20abr;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
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
        
        System.out.print("Ingrese el nombre:");
        nombre = teclado.nextLine();
        
        System.out.print("Ingrese el apellido:");
        apellido = teclado.nextLine();
        
        System.out.print("Ingrese el DNI:");
        dni = teclado.nextInt();
        
        Persona p1 = new Persona(nombre, apellido, dni);
        p1.setPeso(90);
        p1.setAltura(1.9);
        
        System.out.println(p1);
        
    }
    
}

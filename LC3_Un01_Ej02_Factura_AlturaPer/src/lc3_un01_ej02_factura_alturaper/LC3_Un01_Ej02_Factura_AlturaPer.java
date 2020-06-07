package lc3_un01_ej02_factura_alturaper;

import java.util.Scanner;
/**
 *
 * @author Angel Gabriel Zaragoza
 */
public class LC3_Un01_Ej02_Factura_AlturaPer {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("--------------------------------");
        System.out.println("Primer Ejercicio: Guía 1 Ej: 3");
        System.out.println("--------------------------------");
                
        int factura, cod_art, cant;
        float pr_unit, total = 0.0f;
        
        System.out.print("Ingrese el nro de factura: -> ");
        factura = ent.nextInt();
        
        //CICLO PARA CARGAR LOS 3 ITEMS DE LA FACTURA
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " - Cód. de artículo: -> ");
            cod_art = ent.nextInt();
            System.out.print(i + " - Precio unitario: -> ");
            pr_unit = ent.nextFloat();
            System.out.print(i + " - Cantidad: -> ");
            cant = ent.nextInt();
            
            //ACUMULAMOS EL SUBTOTAL DE CADA ITEM
            total += cant * pr_unit;
        }
        
        //MOSTRAMOS EL TOTAL FINAL DE LA FACTURA
        System.out.println("--------------------------------------");
        System.out.println("Total de factura nro " + factura + ": $" + total);
        
        System.out.print("Enter para continuar...");
        ent.nextLine();
        ent.nextLine();
        /*
        ***********************************************************************
        */
        
        System.out.println("--------------------------------");
        System.out.println("Segundo Ejercicio: Guía 1 Ej: 4");
        System.out.println("--------------------------------");
        
        String nomA = "";
        String nomB = "";
        
        float alturaA = 0.0f;
        float alturaB = 0.0f;
        
        
        //PEDIMOS DATOS
        System.out.print("Nombre de la primera Persona: -> ");                
        nomA = ent.nextLine();
        System.out.print("Altura de la primera Persona: -> ");
        alturaA = ent.nextFloat();
        System.out.print("Nombre de la segunda Persona: -> ");
        ent.nextLine(); //VACIAMOS EL SCANNER, SINO NO EJECUTA BIEN LO SGTE:
        nomB = ent.nextLine();
        System.out.print("Altura de la segunda Persona: -> ");
        alturaB = ent.nextFloat();
        
        //ELEGIMOS LA PERSONA MAS ALTA Y MOSTRAMOS
        if (alturaA > alturaB)
        {
            System.out.println("\nLa Persona más alta es " + nomA);
        } else
        {
            System.out.println("\nLa Persona más alta es " + nomB);
        }
    }
    
    
    
}

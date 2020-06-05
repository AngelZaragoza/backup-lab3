
package lc3_parcial1_111610;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Parcial1_111610 {

    public static void main(String[] args) {
        //Para crear el objeto EstacionServicio
        Scanner teclado = new Scanner(System.in);
        String nombreEstacion;
        int cantCargas = 0;
        
        //Para crear los objetos CargaCombustible
        int kmsRecorridos;
        float ltsComb, impCarga;
        
        //Validar que usuario ingrese una cantidad positiva para las cargas
        do {
            System.out.print("Ingrese el Nombre de la Estación de Servicio -> ");
            nombreEstacion = teclado.nextLine();
            System.out.print("Ingrese la Cantidad de cargas a registrar -> ");
            cantCargas = teclado.nextInt();
            if (cantCargas <= 0) {
                System.out.println("Error, debe especificar una cantidad positiva");
                teclado.nextLine();
            }
        } while (cantCargas <= 0);
        
        EstacionServicio estacion = new EstacionServicio(nombreEstacion, cantCargas);
        
        
        for (int i = 0; i < cantCargas; i++) {
            CargaCombustible carga;
            System.out.print("\tIngrese Kms. recorridos desde la ultima carga -> ");
            kmsRecorridos = teclado.nextInt();
            System.out.print("\tIngrese Litros de combustible cargado -> ");
            ltsComb = teclado.nextFloat();
            System.out.print("\tIngrese Importe Abonado por la carga -> ");
            impCarga = teclado.nextFloat();
            
            //Creación de objeto Carga y agregado al arreglo
            carga = new CargaCombustible(kmsRecorridos, ltsComb, impCarga);
            estacion.agregarCarga(carga);
            System.out.println("\tRegistrada carga: " + carga.toString() + "\n");
            
        }
        System.out.println("-------------------------------------------------");
        System.out.println(estacion.toString() + "\n");
        
        //Primer punto
        System.out.println("Mayor importe abonado: $" + estacion.mayorImporte() + "\n");
        
        //Segundo punto
        System.out.println("Total de litros cargados: " + estacion.sumaLtsCargados() + "\n");
        
        //Tercer punto
        System.out.println("------------------------------------------------");
        System.out.print("Ingrese la Cant. de Kms para verificar cargas -> ");
        kmsRecorridos = teclado.nextInt();
        System.out.println("Cargas por debajo de los " + kmsRecorridos + " kms: "
                            + estacion.cargasKmsPorDebajo(kmsRecorridos));
    }

}

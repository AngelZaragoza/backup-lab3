
package lc3_parcial2020_manana;

import java.util.Scanner;

public class LC3_Parcial2020_Manana {

    public static void main(String[] args) {
        //Variables iniciales
        Scanner teclado = new Scanner(System.in);        
        int cantVentas;
        
        //Variables para datos de clientes y ventas
        String nombre;
        int telCliente, cantProd;
        float totalVta, saldoAdeudado;
        
        System.out.println("Ingrese Cant. de Ventas a registrar:");
        cantVentas = teclado.nextInt();
        
        if(cantVentas > 0) {  
            
            Venta ventas = new Venta(cantVentas);
            for (int i = 0; i < cantVentas; i++) {
                Cliente cli;
                do {
                    System.out.println("Ingrese Nombre del Cliente:");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese Teléfono del Cliente");
                    telCliente = teclado.nextInt();
                    System.out.println("Ingrese Cant. de productos vendidos:");
                    cantProd = teclado.nextInt();
                    System.out.println("Ingrese Importe Total de la venta:");
                    totalVta = teclado.nextFloat();
                    System.out.println("Ingrese saldo adeudado");
                    saldoAdeudado = teclado.nextFloat();                    
                    
                    if(totalVta >= saldoAdeudado) {
                        //Crear objeto cliente y agregarlo al arreglo de Ventas en Fiado
                        cli = new Cliente(nombre, telCliente, cantProd, totalVta, saldoAdeudado);
                        ventas.agregarVentaFiado(cli);
                        System.out.println("Venta agregada: " + cli.toString());
                    } else {
                        System.out.println("El importe de la Venta no puede ser menor al Saldo Adeudado");
                    }
                } while(saldoAdeudado > totalVta);
            }
            
            //Punto 1:
            System.out.println("Promedio de importes de todas las Ventas: " + ventas.promedioImporteVentas());
            
            //Punto 2:
            System.out.println("Saldo total adeudado por clientes: " + ventas.sumaImporteAdeudado());
            
            //Punto 3:
            System.out.println("Ingrese importe a verificar: ");
            float importe = teclado.nextFloat();
            System.out.println("Cant. de ventas con importe superior a " + importe + ": " + ventas.ventasSuperiorA(importe));
            
        } else {
            System.out.println("Error. Debe ingresar una cantidad positiva");
        }
        
        
        
    }

}

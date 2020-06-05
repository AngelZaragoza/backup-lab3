/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_banco_ejerc2_unid3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        CuentaCorriente c = new Cuenta();
        Caja_de_Ahorro c = new Cuenta();
       //Banco bco[]= new Banco[2];
       
        Banco cuentas[]= new Banco[2];
        Cuenta c = new Cuenta[2];
        cuentas.AgregarCuenta(c);
        cuentas.AgregarCuenta(c);
        cuentas.Depositar(0, 0, 0);
        cuentas.Extraer();
        cuentas.PromedioSaldoCCorriente();
        cuentas.SaldoCuentaCorriete();
        /*Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de cuenta: ");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("Ingrese el saldo de la cuenta: ");
            float saldo = teclado.nextFloat();
            System.out.println("Ingrese el nombre de la cuenta: ");
            String nombre = teclado.next();

            int opcion;
            do {
                System.out.println("MENU DE OPCIONES: ");
                System.out.println("_______________________________________");
                System.out.println("1- CUENTA CORRIENTE");
                System.out.println("2- CAJA DE AHORRO");
                System.out.println("0- SALIR ");
                System.out.println("________________________________________");
                opcion = teclado.nextInt();

                System.out.println("\n\n\n\n\n\n");
                switch (opcion) {

                    case 0:
                        System.out.println("--------* Programa terminado *---------");
                        break;
                    case 1:
                        System.out.println("Ingrese el limte de su cuenta: ");
                        float limite = teclado.nextFloat();

                        System.out.println("MENU DE OPCIONES: ");
                        System.out.println("_______________________________________");
                        System.out.println("1-DEPOSITAR");
                        System.out.println("2-EXTRAER");
                        System.out.println("0- SALIR ");
                        System.out.println("_______________________________________");
                        opcion = teclado.nextInt();

                        if (opcion == 1) {
                            System.out.println("Importe a depositar: ");
                            float importe = teclado.nextFloat();

                        } else if (opcion == 2) {
                            System.out.println("Importe a Extraer: ");
                            float importe = teclado.nextFloat();
                        } else if (opcion == 0) {
                            System.out.println("--------* Programa terminado *---------");
                        }
                        CuentaCorriente cc = new CuentaCorriente(numero, saldo, nombre, limite);

                    case 2:
                        System.out.println("MENU DE OPCIONES: ");
                        System.out.println("_______________________________________");
                        System.out.println("1-DEPOSITAR");
                        System.out.println("2-EXTRAER");
                        System.out.println("0- SALIR ");
                        System.out.println("_______________________________________");
                        opcion = teclado.nextInt();

                        if (opcion == 2) {
                            System.out.println("Importe a depositar: ");
                            float importe = teclado.nextFloat();

                        } else if (opcion == 2) {
                            System.out.println("Importe a Extraer: ");
                            float importe = teclado.nextFloat();
                        } else if (opcion == 0) {
                            System.out.println("--------* Programa terminado *---------");
                        }
                        Caja_de_Ahorro ca = new Caja_de_Ahorro(numero, saldo, nombre);
                }

            } while (numero != 0);

        } else {
            System.out.println("No numero ingresado es incorrecto");
            System.out.println("--------* Programa terminado *---------");
        }*/
       
    }
}

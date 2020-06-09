/*
---------------------------------------
Guía de Ejercicios Unidad 2
Arreglos y Colecciones - Ej: 1
---------------------------------------
1. Agregar a la clase Equipo (unidad 1) un arreglo con los datos de los jugadores. 
De cada jugador se conoce su nombre, posición (1: arquero, 2: defensor,
3: mediocampo, 4: delantero) número de camiseta, cantidad de partidos jugados
y porcentaje de estado físico (100 equivale a un jugador sano y 0 a uno imposibilitado 
de jugar por lesiones). 
Desarrollar un programa que permita cargar todos los datos de un equipo y a 
continuación informe: 
 Cantidad de jugadores con menos de 10 partidos jugados. 
 Nombre del jugador con mayor cantidad de partidos jugados. 
 Promedio de estado físico de todo el equipo. 
 Estado físico de un jugador particular identificado por número de camiseta. 
 Promedio de partidos jugados de los jugadores de cada posición (4 
resultados). 
 */
package lc3_un02_equipofutbol;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Un02_EquipoFutbol {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreEq;
        int cantJugadores, opcion;
        boolean valido = false;
        boolean carga = false;
        Equipo equipo;

        //Solicitamos datos básicos al usuario y creamos el equipo
        System.out.print("Ingrese Nombre del Equipo -> ");
        nombreEq = teclado.nextLine();
        do {
            System.out.print("Ingrese Cant. de Jugadores (entre 6 y 25) -> ");
            cantJugadores = teclado.nextInt();
            if (cantJugadores > 5 && cantJugadores < 25) {
                valido = true;
            } else {
                System.out.println("Error. Ingrese una cantidad entre 6 y 25");
            }
        } while (!valido);
        equipo = new Equipo(nombreEq, cantJugadores);

        //A continuación solicitar datos de los jugadores
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1 - Agregar Jugador");
            System.out.println("0 - Mostrar datos y Salir");
            System.out.println("--------------------------");
            System.out.print("Ingrese opción -> ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    teclado.nextLine();
                    System.out.print("Ingrese el nombre del Jugador -> ");
                    String nombre = teclado.nextLine();
                    System.out.println("Posición del Jugador:");
                    System.out.println("\t1: Arquero");
                    System.out.println("\t2: Defensor");
                    System.out.println("\t3: Mediocampo");
                    System.out.println("\t4: Delantero");
                    System.out.print("Elija una opción -> ");
                    int posicion = teclado.nextInt();
                    System.out.print("Nro. de Camiseta del Jugador -> ");
                    int camiseta = teclado.nextInt();
                    System.out.print("Partidos jugados del jugador -> ");
                    int partidos = teclado.nextInt();
                    System.out.print("Estado físico del jugador (0-100) -> ");
                    int estadoFis = teclado.nextInt();

                    //Creamos objeto Jugador y agregamos al arreglo dentro de Equipo
                    Jugador jug = new Jugador(nombre, posicion, camiseta, partidos, estadoFis);
                    equipo.agregarJugador(jug);
                    carga = true;
                    System.out.println("Jugador cargado: " + jug.toString());
                    break;

                case 0:
                    System.out.println("--------------------------");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            if (opcion != 0) {
                System.out.println("Enter para continuar...");
                teclado.nextLine();
                teclado.nextLine();
            }

        } while (opcion != 0);

        //Mostramos los datos
        if (carga) {
            //Punto a
            int cantJugadoresMenos10 = equipo.jugadoresMenos10Partidos();
            System.out.println("\nCant. de jugadores con Menos de 10 partidos: " + cantJugadoresMenos10);

            //Punto b
            Jugador auxiliar = equipo.jugadorConMasPartidos();
            System.out.println("\nEl jugador con mayor cant. de partidos jugados es " + auxiliar.getNombre());

            //Punto c
            int promEF = equipo.promedioEstadoFisico();
            System.out.println("\nEl promedio de estado físico del equipo es " + promEF);

            //Punto d
            System.out.println("\nEstado físico de un Jugador:");
            System.out.print("Ingrese Nro. de Camiseta -> ");
            int nroCamiseta = teclado.nextInt();

            int estadoFis = equipo.estadoFisico(nroCamiseta);
            if (estadoFis != -1) {
                System.out.println("El Estado Físico del Jugador con la Camiseta "
                        + nroCamiseta + " es " + estadoFis);
            } else {
                System.out.println("No se encuentra el Nro. de Camiseta ingresado");
            }

            //Punto e
            System.out.println("\nPromedio de Partidos jugados de cada Posición:");
            int promedio[] = equipo.promPartJugados();
            System.out.println("1- Arqueros: " + promedio[0]);
            System.out.println("2- Defensores: " + promedio[1]);
            System.out.println("3- Mediocampos: " + promedio[2]);
            System.out.println("4- Delanteros: " + promedio[3]);

        } else {
            System.out.println("No hay jugadores cargados para mostrar");
        }

        System.out.println("Programa terminado");
    }

}


package lc3_un02_clase27abr;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Un02_Clase27Abr {
    
    public static void main(String[] args) {
        int [] arreglo = new int[10];
        String [] arregloStrings = new String[4];
        
        //Carga directa
        arreglo[0] = 89;
        arreglo[2] = 55;
        
        //Pedimos tamaño del arreglo al usuario
        Scanner teclado = new Scanner(System.in);        
        System.out.print("Ingrese una cantidad de números -> ");
        int cant = teclado.nextInt();
        
        //Creamos arreglo con el ingreso del usuario y la variable acumulador
        int [] arregloCant = new int [cant];
        int acumulador = 0;
        
        //Pedimos ingreso al usuario y llenamos el vector y el acumulador
        System.out.println("Ingrese " + cant + " números -> ");        
        for (int i = 0; i < arregloCant.length; i++) {
            
            arregloCant[i] = teclado.nextInt();
            acumulador += arregloCant[i];
        }    
        //Mostramos el promedio
        System.out.println("Promedio: " + (double)acumulador / arregloCant.length);
        
        //******************************************************************
        
        
        System.out.print("Ingrese una cantidad de personas -> ");
        cant = teclado.nextInt();
        
        Persona [] personas = new Persona[cant];        
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Ingrese el peso de la persona " + (i+1) + "-> ");
            double peso = teclado.nextDouble();
            personas[i] = new Persona(peso);
        }
        
        double acumuladorPesos = 0;
        for (int i = 0; i < personas.length; i++) {
            acumuladorPesos += personas[i].getPeso();
        }
        
        System.out.println("El promedio de pesos es " + acumuladorPesos / personas.length);
        
        
        //Ejercicio de arreglo de objetos
        Jugador [] jugadores;
        System.out.print("Ingrese una cantidad de jugadores -> ");
        cant = teclado.nextInt();
        
        jugadores = new Jugador[cant];
        
        for (int i = 0; i < jugadores.length; i++) {
            teclado.nextLine();
            System.out.print("Ingrese el nombre del jugador " + (i+1) + " -> ");
            String nombre = teclado.nextLine();
            System.out.print("Ingrese la posición del jugador " + (i+1) + " -> ");
            int posicion = teclado.nextInt();
            System.out.print("Nro de camiseta del jugador " + (i+1) + " -> ");
            int camiseta = teclado.nextInt();
            System.out.print("Partidos jugados del jugador " + (i+1) + " -> ");
            int partidos = teclado.nextInt();
            System.out.print("Estado físico del jugador " + (i+1) + " -> ");
            int estadoFis = teclado.nextInt();
            jugadores[i] = new Jugador(nombre,posicion,camiseta,partidos,estadoFis);
        }
        
        int cantJugadoresMenos10 = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getCantPartidosJugados() < 10)
                cantJugadoresMenos10++;
        }
        System.out.println("Hay " + cantJugadoresMenos10 + " jugadores con menos de 10 partidos");
        
        Jugador auxiliar = jugadores[0];
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getCantPartidosJugados() > auxiliar.getCantPartidosJugados())
                auxiliar = jugadores[i];
        }
        System.out.println("El jugador con mayor cant. de partidos jugados es " + auxiliar.getNombre());
        
        
        int acumuladorEstadoFisico = 0;
        int contadorJugadores = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                acumuladorEstadoFisico = jugadores[i].getEstadoFisico();
                contadorJugadores++;
            }
        }
        System.out.println("El promedio de estado físico del equipo es " + 
                            acumuladorEstadoFisico / contadorJugadores);
        
        
        System.out.print("Ingrese un nro de camiseta -> ");
        int nroCamiseta = teclado.nextInt();
        int estadoFisicoEncontrado = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getNroCamiseta() == nroCamiseta) {
                estadoFisicoEncontrado = jugadores[i].getEstadoFisico();
                break;
            }                
        }
        System.out.println("El estado fisico del jugador con la camiseta " +
                            nroCamiseta + " es " + estadoFisicoEncontrado);
        
        int [] acumuladorPosiciones = new int [4];
        int [] contadorPosiciones = new int [4];
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null)
            {
                switch(jugadores[i].getPosicion())
                {
                    case 1:
                       acumuladorPosiciones[0] += jugadores[i].getCantPartidosJugados();
                       contadorPosiciones[0]++;
                       break;
                    case 2:
                       acumuladorPosiciones[1] += jugadores[i].getCantPartidosJugados();
                       contadorPosiciones[1]++;
                       break;
                    case 3:
                       acumuladorPosiciones[2] += jugadores[i].getCantPartidosJugados();
                       contadorPosiciones[2]++;
                    case 4:
                       acumuladorPosiciones[3] += jugadores[i].getCantPartidosJugados();
                       contadorPosiciones[3]++;
                       
                }
                    
            }
            
        }
    }
    
}

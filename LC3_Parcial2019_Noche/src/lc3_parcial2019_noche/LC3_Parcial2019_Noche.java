
package lc3_parcial2019_noche;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Parcial2019_Noche {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Datos del jugador
        String nombre;
        int cantJugadas;
        
        //Datos de las apuestas
        int nroJugado, nroGanador;
        float dinero;
        
        //Solicitamos datos al usuario
        System.out.println("Ingrese el nombre del jugador:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la cantidad de jugadas de la noche:");
        cantJugadas = teclado.nextInt();
        
        //Creamos objeto Jugador
        Jugador jug1 = new Jugador(nombre, cantJugadas);
        
        //Solicitamos datos de las apuestas y vamos llenando el vector en Jugador
        for (int i = 0; i < cantJugadas; i++) {
            System.out.println("Ingrese nro Apostado:");
            nroJugado = teclado.nextInt();
            
            System.out.println("Ingrese dinero Apostado:");
            dinero = teclado.nextFloat();
            
            System.out.println("Ingrese nro Ganador:");
            nroGanador = teclado.nextInt();
            
            //Creamos objeto apuesta y lo pasamos como parametro a agregarApuesta
            Apuesta apu = new Apuesta(nroJugado, nroGanador, dinero);
            jug1.agregarApuesta(apu);
            System.out.println("Apuesta ingresada: " + apu.toString());
        }
        
        //Punto 1:
        System.out.println("Cantidad de apuestas ganadas por el jugador: " + jug1.cantApuestasGanadas());
        
        //Punto 2:
        System.out.println("Total de dinero ganado: $" + jug1.totalGanado());
        
        //Punto 3:
        System.out.println("Ingrese el número que quiere verificar:");
        nroGanador = teclado.nextInt();
        System.out.println("Cant de veces que salió el número ingresado: " + jug1.salioNumero(nroGanador));
        
        //Punto 4:
        System.out.println("Total de dinero apostado a nros pares: $" + jug1.sumaApostadaPares());
        
        
        //Bonus track
        System.out.println(jug1.toString());        
        
    }

}

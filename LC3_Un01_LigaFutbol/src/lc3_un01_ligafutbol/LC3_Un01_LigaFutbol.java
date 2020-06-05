
package lc3_un01_ligafutbol;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Un01_LigaFutbol {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fecha;
        int golesLocal;
        int golesVisitante;
        
        System.out.print("Ingrese fecha de la liga(1, 2... etc -> ");
        fecha = teclado.nextInt();
        Equipo local = new Equipo();
        System.out.print("Nombre equipo Local -> ");
        teclado.nextLine();
        local.setNombre(teclado.nextLine());
        System.out.print("Goles equipo Local -> ");
        golesLocal = teclado.nextInt();
        
        Equipo visitante = new Equipo();
        System.out.print("Nombre equipo Visitante -> ");
        teclado.nextLine();
        visitante.setNombre(teclado.nextLine());
        System.out.print("Goles equipo Visitante -> ");
        golesVisitante = teclado.nextInt();
        
        
        
        Partido partido = new Partido();
        partido.setFecha(fecha);
        partido.setEquipoLocal(local);
        partido.setEquipoVisitante(visitante);
        partido.setGolesLocal(golesLocal);
        partido.setGolesVisit(golesVisitante);        
        
        
        System.out.println(partido);
        if (golesLocal != golesVisitante)
        {
            if (golesLocal > golesVisitante)
                System.out.println("El ganador es " + local.getNombre());
            else
                System.out.println("El ganador es " + visitante.getNombre());
        } else
            System.out.println("El partido terminó empatado");
        
        //Me falta implementar que se guarden los goles y resultados
        //en los dos equipos. Pero como se crean nuevos cada vez no me puse aun.
    }
    
}

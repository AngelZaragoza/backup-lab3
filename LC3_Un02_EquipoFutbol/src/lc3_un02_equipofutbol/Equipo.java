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
*/

package lc3_un02_equipofutbol;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Equipo {
    //ATRIBUTOS
    private String nombre;
    private int puntos;
    private int partGanados;
    private int partPerdidos;
    private int partEmpatados;
    private int golesHechos;
    private int golesRecib;
    private int posicion;
    private Jugador jugadores[];
    
    //CONSTRUCTORES
    public Equipo()
    {}
    
    public Equipo(String nombre, int cantJugadores) {
        this.nombre = nombre;
        jugadores = new Jugador[cantJugadores];
    }
    
    public Equipo(String nombre, int ptos, int partGan, int partPer,
                int partEmp, int golesFav, int golesCon, int posicion) {
        this.nombre = nombre;
        puntos = ptos;
        partGanados = partGan;
        partPerdidos = partPer;
        partEmpatados = partEmp;
        golesHechos = golesFav;
        golesRecib = golesCon;
        this.posicion = posicion;        
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartGanados() {
        return partGanados;
    }

    public void setPartGanados(int partGanados) {
        this.partGanados = partGanados;
    }

    public int getPartPerdidos() {
        return partPerdidos;
    }

    public void setPartPerdidos(int partPerdidos) {
        this.partPerdidos = partPerdidos;
    }

    public int getPartEmpatados() {
        return partEmpatados;
    }

    public void setPartEmpatados(int partEmpatados) {
        this.partEmpatados = partEmpatados;
    }

    public int getGolesHechos() {
        return golesHechos;
    }

    public void setGolesHechos(int golesHechos) {
        this.golesHechos = golesHechos;
    }

    public int getGolesRecib() {
        return golesRecib;
    }

    public void setGolesRecib(int golesRecib) {
        this.golesRecib = golesRecib;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    //METODOS DEL ARREGLO DE JUGADORES
    public void agregarJugador(Jugador jug) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = jug;
                break;
            }            
        }
    }
    
    public int jugadoresMenos10Partidos () {
        int cant = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getCantPartidosJugados() < 10)
                    cant++;
            } else {
                break;
            } 
        }        
        return cant;
    }
    
    public Jugador jugadorConMasPartidos () {
        Jugador aux = new Jugador();
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getCantPartidosJugados() > aux.getCantPartidosJugados())
                    aux = jugadores[i];
            } else {
                break;
            }            
        }
        return aux;
    }
    
    //Devuelve promedio de estado físico de los jugadores cargados,
    //o devuelve -1 en caso que no haya ningún jugador cargado
    public int promedioEstadoFisico() {
        int contJug = 0;
        int acumEF = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                contJug++;
                acumEF += jugadores[i].getEstadoFisico();
            } else {
                break;
            }            
        }
        if (contJug > 0)
            return acumEF / contJug;
        else
            return -1;
    }
    
    //Si encuentra el nro de camiseta, devuelve el estado físico correspondiente
    //Sino, devuelve -1
    public int estadoFisico(int nroCamiseta) {        
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getNroCamiseta() == nroCamiseta) {
                    return jugadores[i].getEstadoFisico();
                }
            } else {
                break;
            }            
        }
        
        return -1;
    }
    
    public int[] promPartJugados() {        
        int pos = 4; //Cant. de posiciones diferentes que puede tener un jugador
        int [] acumuladorPosiciones = new int [pos];
        int [] contadorPosiciones = new int [pos];
        int [] promedioPartidos = new int [pos];
        
        //Acumular partidos jugados y contar por posicion del jugador
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                switch(jugadores[i].getPosicion()) {
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
                        break;
                    case 4:
                        acumuladorPosiciones[3] += jugadores[i].getCantPartidosJugados();
                        contadorPosiciones[3]++;
                        break;
                }
            } else {
                break;
            }
            
        }
        
        //Calcular promedio y devolver
        for (int i = 0; i < promedioPartidos.length; i++) {
            if (contadorPosiciones[i] != 0)
                promedioPartidos[i] = acumuladorPosiciones[i] / contadorPosiciones[i];
        }
        
        return promedioPartidos;
    }
    
    @Override
    public String toString() {
        return "Equipo: " + nombre + "\nPuntos: " + puntos + 
                " - Posición: " + posicion +
                ".\nPartidos -- " + 
                "Ganados: " + partGanados + " - Perdidos: " + partPerdidos + 
                " - Empates: " + partEmpatados +
                "\nGoles -- " +
                "Realizados:" + golesHechos + " - Recibidos: " + golesRecib;                
    }
}

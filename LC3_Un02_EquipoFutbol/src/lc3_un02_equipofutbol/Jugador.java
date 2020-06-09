/*
---------------------------------------
Guía de Ejercicios Unidad 2
Arreglos y Colecciones - Ej: 1
---------------------------------------
*/

package lc3_un02_equipofutbol;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Jugador {
    private String nombre;
    private int posicion;
    private int nroCamiseta;
    private int cantPartidosJugados;
    private int estadoFisico;

    //CONSTRUCTORES
    public Jugador()
    {}

    public Jugador(String nombre, int posicion, int nroCamiseta, int cantPartidosJugados, int estadoFisico) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
        this.cantPartidosJugados = cantPartidosJugados;
        this.estadoFisico = estadoFisico;
    }
        
    
    //SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public int getCantPartidosJugados() {
        return cantPartidosJugados;
    }

    public void setCantPartidosJugados(int cantPartidosJugados) {
        this.cantPartidosJugados = cantPartidosJugados;
    }

    public int getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(int estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Posición:" + posicion + " - Camiseta: " + nroCamiseta;
    }
    
    

}

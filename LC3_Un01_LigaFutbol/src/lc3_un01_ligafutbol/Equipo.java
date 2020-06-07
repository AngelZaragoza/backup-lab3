package lc3_un01_ligafutbol;

/**
 *
 * @author Zaragoza Angel Gabriel
 */

/*
---------------------------------------
Guía de Ejercicios Un. 1 - POO - Ej: 3
---------------------------------------
3. Programar una clase Equipo que represente a un equipo de fútbol. Incluir 
en la misma atributos para almacenar el nombre del equipo y los datos relativos
a un campeonato con forma de liga: puntos, cantidad de partidos ganados, empatados 
y perdidos, cantidad de goles realizados y recibidos y posición. 
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
    
    
    //CONSTRUCTORES
    public Equipo()
    {}
    
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


package lc3_un01_ligafutbol;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Partido {
    //ATRIBUTOS
    private int fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;    
    private int golesLocal;
    private int golesVisit;
    
    //CONSTRUCTORES

    public Partido() {
        this.fecha = 0;
        this.equipoLocal = null;
        this.equipoVisitante = null;
        
        this.golesLocal = 0;
        this.golesVisit = 0;
    }
    
    public Partido(int fecha, Equipo equipoLocal, Equipo equipoVisitante,
                    int golesTotal, int golesLocal, int golesVisit) {
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;        
        this.golesLocal = golesLocal;
        this.golesVisit = golesVisit;
    }
    
    //GETTERS Y SETTERS

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }    
    
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
    
    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisit() {
        return golesVisit;
    }

    public void setGolesVisit(int golesVisit) {
        this.golesVisit = golesVisit;
    }
    
    
    
    @Override
    public String toString() {
        return "Fecha: " + fecha + " | Local: " + equipoLocal.getNombre() +
                " - Visitante: " + equipoVisitante.getNombre() +
                "\nMarcador final: " + golesLocal + "-" + golesVisit;
    }
}

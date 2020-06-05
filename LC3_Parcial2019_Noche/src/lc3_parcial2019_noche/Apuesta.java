
package lc3_parcial2019_noche;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Apuesta {
    private int nroApostado;
    private int nroGanador;
    private float dinero;

    //CONSTRUCTOR
    public Apuesta(int nroApostado, int nroGanador, float dinero) {
        this.nroApostado = nroApostado;
        this.nroGanador = nroGanador;
        this.dinero = dinero;
    }

    //GETTERS
    public int getNroApostado() {
        return nroApostado;
    }

    public int getNroGanador() {
        return nroGanador;
    }

    public float getDinero() {
        return dinero;
    }
    
    
    @Override
    public String toString() {
        return "Apuesta{" + "nroApostado=" + nroApostado + ", nroGanador=" + nroGanador + ", dinero=" + dinero + '}';
    }
    
    
    
    
}

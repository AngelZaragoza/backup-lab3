package lc3_un02_clase04mayo;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Pago {
    private int demora;
    private double importe;
    private double interesesAdicionales;
    
    //CONSTRUCTORES

    public Pago(int demora, double importe, double interesesAdicionales) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = interesesAdicionales;
    }    

    //GETTERS Y SETTERS
    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public void setInteresesAdicionales(double interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }
    
    //METODOS
    
    
}

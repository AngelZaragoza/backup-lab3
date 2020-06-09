
package PruebaSwing;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public abstract class Propiedad {
    private String direccion;
    private int cantidadHabitaciones;
    private double precioAlquiler;
    private boolean usoComercial;
    private int cantidadInquilinos;

    //CONSTRUCTOR
    public Propiedad(String direccion, int cantidadHabitaciones, double precioAlquiler, boolean usoComercial, int cantidadInquilinos) {
        this.direccion = direccion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.precioAlquiler = precioAlquiler;
        this.usoComercial = usoComercial;
        this.cantidadInquilinos = cantidadInquilinos;
    }

    //GETTERS
    public String getDireccion() {
        return direccion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public int getCantidadInquilinos() {
        return cantidadInquilinos;
    }
    
    public abstract double precioAlquiler();
        
}

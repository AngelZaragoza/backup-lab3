
package PruebaSwing;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Casa extends Propiedad {
    private boolean garage;

    //CONSTRUCTOR
    public Casa(String direccion, int cantidadHabitaciones, double precioAlquiler, boolean usoComercial, int cantidadInquilinos, boolean garage) {
        super(direccion, cantidadHabitaciones, precioAlquiler, usoComercial, cantidadInquilinos);
        this.garage = garage;
    }

    //GETTERS
    public boolean isGarage() {
        return garage;
    }
    
    
    @Override
    public double precioAlquiler() {
        double precio = getPrecioAlquiler();
        if (isUsoComercial())
            precio += 1000;
        
        return precio;
    }

    @Override
    public String toString() {
        return "Casa - Dir: " + getDireccion();
    }
    
    
    
}

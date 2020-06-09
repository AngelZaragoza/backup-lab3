
package PruebaSwing;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Departamento extends Propiedad {
    private double expensas;

    public Departamento(String direccion, int cantidadHabitaciones, double precioAlquiler, boolean usoComercial, int cantidadInquilinos, double expensas) {
        super(direccion, cantidadHabitaciones, precioAlquiler, usoComercial, cantidadInquilinos);
        this.expensas = expensas;
    }

    @Override
    public double precioAlquiler() {
        double precio = getPrecioAlquiler() + expensas;
        if (isUsoComercial())
            precio += 500;
        
        return precio;
    }

    @Override
    public String toString() {
        return "Departamento - Dir: " + getDireccion();
    }
    
    
    
}


package PruebaSwing;

import java.util.ArrayList;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Inmobiliaria {
    private ArrayList<Propiedad> propiedades;
    
    public Inmobiliaria() {
        propiedades = new ArrayList();
    }
    
    public void agregarPropiedad(Propiedad prop) {
        propiedades.add(prop);
    }
    
    public double promedioAlquileres () {
        double acum = 0;
        for (Propiedad props : propiedades) {
            acum += props.getPrecioAlquiler();
        }
        return acum/propiedades.size();
    }
    
    //Calcular y mostrar la cantidad de propiedades que sean de uso comercial
    public int cantTresOMas () {
        int cont = 0;        
        for (Propiedad props : propiedades) {
            if (props.getCantidadHabitaciones() >= 3 && props.isUsoComercial()) {
                cont++;
            }
        }
        
        return cont;
    }
}

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

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    
    public void agregarPropiedad(Propiedad prop) {
        propiedades.add(prop);
    }

    public double promedioAlquileres() {
        double acum = 0;
        for (Propiedad props : propiedades) {
            acum += props.precioAlquiler();
        }
        return acum / propiedades.size();
    }

    //Calcular y mostrar la cantidad de casas de 3 o más habitaciones con garage
    public int cantTresOMas() {
        int cont = 0;
        for (Propiedad props : propiedades) {
            if (props instanceof Casa) {
                Casa c = (Casa) props;
                if (props.getCantidadHabitaciones() >= 3 && c.isGarage()) {
                    cont++;
                }
            }

        }
        return cont;
    }
    
    //Calcular y mostrar el monto promedio de alquileres de las propiedades
    //en donde vivan 2 inquilinos. 
    
}

package lc3_un02_clase04mayo;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Un02_Clase04Mayo {

    
    public static void main(String[] args) {
        int tamanio = 3;
        Scanner teclado = new Scanner(System.in);
        
        Municipalidad muni = new Municipalidad(tamanio);
        
        //Carga de datos por parte del usuario (prueba)
        Plan p = new Plan("Angel",1000,3);
        //Agregamos plan al objeto muni
        muni.agregarPlan(p);
        
        //Mostramos prueba...
        System.out.println("La cantidad de planes pagados totalmente es de " + 
                muni.cantidadPlanesPagados());
        System.out.println("El promedio de intereses pagados por los contribuyentes es " +
                muni.promedioIntereses());
    }

}


package lc3_un02_clase04mayo;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Municipalidad {
    private Plan [] planes;
    
    //CONSTRUCTORES
    public Municipalidad(int tamanio) {
        planes = new Plan[tamanio];
    }
    
    //METODOS    
    public void agregarPlan(Plan plan) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null)
            {
                planes[i] = plan;
                break;
            }
        }
    }
    
    public int cantidadPlanesPagados() {
        int cantidad = 0;
        
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null)
            {
                if (planes[i].estaPagadoTotalmente())                
                    cantidad++;
            }
            
        }
        return cantidad;
    }
    
    public double promedioIntereses () {
        double totalIntereses = 0;
        int contadorPlanes = 0;
        
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null)
            {
                totalIntereses += planes[i].sumaInteresesCobrados();
                contadorPlanes++;
            }            
        }
        //totalAcumulado / cantidadElementos
        return totalIntereses / contadorPlanes;
    }
}

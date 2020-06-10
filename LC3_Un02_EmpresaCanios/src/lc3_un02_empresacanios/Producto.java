/*
---------------------------------------
Guía de Ejercicios Unidad 2
Arreglos y Colecciones - Ej: 3
---------------------------------------
--- Consignas Varias ---
*/

package lc3_un02_empresacanios;

/**
 *
 * @author Zaragoza Angel Gabriel
 */

/*2. Desarrolle la clase Producto de manera que contenga en su interior los 
atributos descripción (String) y Materiales (Material[]). */
public class Producto {

    private String descripcion;
    private Material[] materiales;

    //CONSTRUCTORES
    public Producto() {
    }

    /*3. Desarrolle en la clase Producto un constructor que reciba por parámetro
    una cantidad de elementos y dimensione el vector de materiales. */
    public Producto(String descripcion, int cantElementos) {
        this.descripcion = descripcion;
        materiales = new Material[cantElementos];
    }

    public String getDescripcion() {
        return descripcion;
    }

    //METODOS
    /*4. Desarrolle en la clase Producto un método que permita agregar un Material 
    recibido por parámetro al vector. */
    public void agregarMaterial(Material mat) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = mat;
                break;
            }

        }
    }

    /*5. Desarrolle en la clase Producto un método que retorne el costo total.
    Dicho valor se calcula sumando todos los valores unitarios de los Materiales
    que componen el Producto. */
    public float costoTotal() {
        float acumCosto = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                acumCosto += materiales[i].getValorUnitario();
            } else {
                break;
            }
        }
        return acumCosto;
    }

    /*6. Desarrolle en la clase Producto un método que reciba por parámetro un código 
    de material y retorne true si dicho material forma parte del Producto. */
    public boolean usaMaterial(int codigoMat) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                if (materiales[i].getCodigo() == codigoMat) {
                    return true;
                }
            }
        }
        return false;
    }

    /*7. Desarrolle en la clase producto un método que retorne un vector con todos
    los materiales que tengan un valor unitario menor a un parámetro. */
    public Material[] materialesCostoMenorA(float valor) {
        //Buscamos la posición del último elemento cargado 
        //para recuperar la cantidad de materiales cargados
        int tamanio = 0;
        for (int i = (materiales.length - 1); i >= 0; i--) {
            if (materiales[i] != null) {
                tamanio = i + 1;
                break;
            }
        }        
        
        //Si conseguimos elementos, creamos un arreglo con esa cantidad
        //y recorremos el arreglo original para llenar el auxiliar
        Material[] matCostoMenor = new Material[tamanio];

        int j = 0;      //Controla el indice del arreglo matCostoMenor
        boolean posi = false;   //Marca si encuentra al menos una coincidencia
        for (int i = 0; i < tamanio; i++) {
            if (materiales[i].getValorUnitario() < valor) {
                matCostoMenor[j] = materiales[i];
                j++;
                posi = true;
            }
        }
        
        //Si encuentra una coincidencia retorna el arreglo, sino null
        if (posi)
            return matCostoMenor;
        else {
            System.out.println("\tNo hay resultados");
            return null;
        }            
    }

    /*8. Desarrolle en la clase producto un método que retorne un vector donde cada 
    casillero contenga la cantidad de materiales por precio, siguiendo las siguiente 
    regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20 
    contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer 
    casillero. Si precio > 30 contarlo en el cuarto casillero. */
    public int[] matPorRangoPrecio() {
        int[] rangoPrecios = {0, 0, 0, 0};
        float precio;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                precio = materiales[i].getValorUnitario();
                if (precio > 30) {
                    rangoPrecios[3]++;
                } else if (precio <= 30 && precio > 20) {
                    rangoPrecios[2]++;
                } else if (precio <= 20 && precio > 10) {
                    rangoPrecios[1]++;
                } else if (precio <= 10 && precio > 0) {
                    rangoPrecios[0]++;
                }
            }
        }
        return rangoPrecios;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = "Producto: " + descripcion + " - Materiales:";
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                cadena += "\n\t" + materiales[i].toString();
            } else {
                break;
            }
        }
        return cadena;
    }
}

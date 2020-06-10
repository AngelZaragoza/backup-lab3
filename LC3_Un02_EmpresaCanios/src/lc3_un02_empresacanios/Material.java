/*
---------------------------------------
Guía de Ejercicios Unidad 2
Arreglos y Colecciones - Ej: 3
---------------------------------------
 Desarrolle la clase Material de manera que contenga en su interior los 
atributos: descripción (String) código(int) valorUnitario (float). 
*/
package lc3_un02_empresacanios;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
//Punto 1:
public class Material {
    private int codigo;
    private String descripcion;
    private float valorUnitario;
    
    //CONSTRUCTORES
    public Material ()
    {}

    public Material(int codigo, String descripcion, float valorUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
    }
    
    //GETTERS

    public int getCodigo() {
        return codigo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }
    
    @Override
    public String toString() {
        return "Mat. Cód: " + codigo + " - Desc: " + descripcion +
                " - Pr.Unit: " + valorUnitario;
    }
    
}

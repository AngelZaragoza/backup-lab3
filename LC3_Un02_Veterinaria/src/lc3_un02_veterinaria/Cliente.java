/*
---------------------------------------
Guía de Ejercicios Unidad 2
Arreglos y Colecciones - Ej: 2
---------------------------------------
2. Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización 
de un software para obtener resultados sobre sus clientes y sus
respectivas mascotas. (Suponer que cada cliente posee una sola mascota) 
*/

package lc3_un02_veterinaria;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Cliente {
    private int codigo;
    private String nombre;
    private int antiguedad;
    private Mascota mascota;
    
    //CONTRUCTORES
    public Cliente()
    {}

    public Cliente(int codCliente, String nombreCliente, int antigCliente) {
        this.codigo = codCliente;
        this.nombre = nombreCliente;
        this.antiguedad = antigCliente;
        this.mascota = null;
    }
    
    //GETTERS Y SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
        
    //METODOS
    public void agregarMascota (Mascota masc) {
        mascota = masc;
    }
    
    
    @Override
    public String toString() {
        return "Cód: " + codigo + " - Nombre: " + nombre +
                " - Antigüedad: " + antiguedad + " años." +
                "\n Mascota: " + mascota.toString();
    }
    
    
}

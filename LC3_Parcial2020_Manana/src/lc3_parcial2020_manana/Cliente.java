
package lc3_parcial2020_manana;

public class Cliente {
    private String nombre;
    private int telefono;
    private int cantProds;
    private float importeVenta;
    private float saldoAdeudado;    

    //CONSTRUCTOR
    public Cliente(String nombre, int telefono, int cantProds, float importeVenta, float saldoAdeudado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cantProds = cantProds;
        this.importeVenta = importeVenta;
        this.saldoAdeudado = saldoAdeudado;
    }

    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCantProds() {
        return cantProds;
    }

    public float getImporteVenta() {
        return importeVenta;
    }

    public float getSaldoAdeudado() {
        return saldoAdeudado;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        cadena = "Cliente: " + nombre + " - Tel: " + telefono + ". Deuda: " + saldoAdeudado;
        return cadena;
    }    
    
}

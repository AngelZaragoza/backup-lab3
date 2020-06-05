
package ofertassuper;


public class Producto {
    // número del producto, nombre del producto, el precio regular 
    protected int nroProducto;
    protected String nombreProducto;
    protected double precioRegular;
    
    public Producto(){
    
    }

    public Producto(int nroProducto, String nombreProducto, double precioRegular) {
        this.nroProducto = nroProducto;
        this.nombreProducto = nombreProducto;
        this.precioRegular = precioRegular;
    }

    public int getNroProducto() {
        return nroProducto;
    }

    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    @Override
    public String toString() {
        return "Producto{" + "nroProducto=" + nroProducto + ", nombreProducto=" + nombreProducto + ", precioRegular=" + precioRegular + '}';
    }

    
    
    
    
    
}

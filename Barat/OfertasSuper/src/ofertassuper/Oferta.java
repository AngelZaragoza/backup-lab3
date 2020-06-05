
package ofertassuper;


public class Oferta extends Producto{
    
    // precio de la oferta, la cantidad de días de vigencia de la misma 
    //y la cantidad de unidades que se poseen para la venta, es decir, el stock. 
    private double precioOferta;
    private int diasVigencia;
    private int stockOferta;

    public Oferta(double precioOferta, int diasVigencia, int stockOferta, int nroProducto, String nombreProducto, double precioRegular) {
        super(nroProducto, nombreProducto, precioRegular);
        this.precioOferta = precioOferta;
        this.diasVigencia = diasVigencia;
        this.stockOferta = stockOferta;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public int getDiasVigencia() {
        return diasVigencia;
    }

    public void setDiasVigencia(int diasVigencia) {
        this.diasVigencia = diasVigencia;
    }

    public int getStockOferta() {
        return stockOferta;
    }

    public void setStockOferta(int stockOferta) {
        this.stockOferta = stockOferta;
    }

    @Override
    public String toString() {
        return nombreProducto + " " + precioOferta + " " + diasVigencia;
    }
    
    public double cantDescuento(){
        return precioRegular - precioOferta;
    }    
    
    
}

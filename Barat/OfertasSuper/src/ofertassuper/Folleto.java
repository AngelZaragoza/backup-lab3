/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofertassuper;

/**
 *
 * @author Emiliano Barat
 */
public class Folleto {
    
    private Oferta[] ofertas;
    private int diaIncio;

    public Folleto(int cantidad, int diaIncio) {
        this.ofertas = new Oferta[cantidad];
        this.diaIncio = diaIncio;
    }
    
    public void agragarOferta(Oferta o){
        for (int i = 0; i < ofertas.length; i++) {
            if(ofertas[i] == null){
                ofertas[i] = o;
                break;
            }
            
        }
    }
    
    public int cantOfertasMas5Dias(){
        
        int cant = 0;
        for (Oferta oferta : ofertas) {
            if(oferta.getDiasVigencia() > 5){
                cant++;
            }
        }
        return cant;
    }
    
    public int cantStockTotal(){
        int cant = 0;
        for (Oferta oferta : ofertas) {
            if(oferta != null){
                cant += oferta.getStockOferta();
            }
        }
        return cant;
    }
    
    public int cantArticulosPrecioMayor20(){
        int cant = 0;
        for (Oferta oferta : ofertas) {
            if(oferta != null){
                if (oferta.cantDescuento() > 20) {
                    cant++;
                }
            }
        }
        return cant;
    }
    
    //4. Totalarecaudarporunartículoenparticularindicadoporsucódigo,suponiendoquesevendantodas las unidades disponibles.
    
    public double totalRecaudarPorProducto(int codProducto){
        double totalRecaudar = 0;
        for (Oferta oferta : ofertas) {
            if (oferta != null) {
                if (oferta.getNroProducto() == codProducto) {
                    totalRecaudar = oferta.getPrecioOferta() * oferta.getStockOferta();
                    //AGREGAR UN BREAK ACA
                }
            }
        }
        return totalRecaudar;
    }    
    
}

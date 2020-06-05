
package ofertassuper;

import java.util.Scanner;


public class OfertasSuper {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de ofertas a cargar:");
        
        int cantidad = sc.nextInt();
        
        System.out.println("Indique que dia comienza la oferta:");
        int diaInicio = sc.nextInt();
        
        Folleto f = new Folleto(cantidad, diaInicio);        
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Codigo del producto que entra de oferta:");
            int codProducto = sc.nextInt();
            
            System.out.println("Nombre del Producto?");
            sc.nextLine();
            String nombreProducto = sc.nextLine();
            System.out.println("Indique el precio regular:");
            double precioRegular = sc.nextDouble();
            
            System.out.println("Precio de oferta:");
            double precioOferta = sc.nextDouble();
            System.out.println("Cuanto durara la oferta?");
            int duracionOferta = sc.nextInt();
            System.out.println("Cuantas unidades hay en oferta?");
            int stock = sc.nextInt();
            
            Oferta o = new Oferta(precioOferta, duracionOferta, stock, codProducto, nombreProducto, precioRegular);
            
            f.agragarOferta(o);        
            
        }
        
        System.out.println("Cantidad de articulos ofertados por mas de 5 dias " + f.cantOfertasMas5Dias());
        
        System.out.println("Cantidad de unidades a la venta " + f.cantStockTotal());
        
        System.out.println("Cantidad de articulos con descuento superior a $20 " + f.cantArticulosPrecioMayor20());
        
        System.out.println("Indique el codigo de producto para saber su recaudacion: ");
        int codProducto = sc.nextInt();
        
        System.out.println("El producto cod: " + codProducto + " recaudo : " + f.totalRecaudarPorProducto(codProducto));       
                
    }
    
}

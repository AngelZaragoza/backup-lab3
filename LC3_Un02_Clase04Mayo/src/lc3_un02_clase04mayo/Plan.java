package lc3_un02_clase04mayo;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Plan {

    private String nombre;
    private double deuda;
    private int cuotas;
    private Pago[] pagos;

    //CONSTRUCTORES
    public Plan(String nombre, double deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        this.pagos = new Pago[cuotas];
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    //METODOS    
    public void agregarPago(Pago pago) {
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i] = pago;
                break;
            }

        }
    }

    public boolean estaPagadoTotalmente() {
        boolean estaPago = true;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                estaPago = false;
                break;
            }
        }
        return estaPago;
    }

    public double sumaInteresesCobrados() {
        double sumaIntereses = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                if (pagos[i].getDemora() > 0) {
                    sumaIntereses += pagos[i].getDemora() * pagos[i].getInteresesAdicionales() * pagos[i].getImporte();
                }
            }
        }

        return sumaIntereses;
    }
}

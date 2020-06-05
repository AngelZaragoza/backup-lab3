package lc3_parcial2020_manana;

public class Venta {

    private Cliente[] clientes;

    //CONSTRUCTOR
    public Venta(int cantVentas) {
        clientes = new Cliente[cantVentas];
    }

    public void agregarVentaFiado(Cliente cli) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cli;
                break;
            }
        }
    }

    public float promedioImporteVentas() {
        float prom = 0;
        int cont = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                prom += clientes[i].getImporteVenta();
                cont++;
            }
        }

        if (cont > 0) {
            prom = prom / cont;
        }

        return prom;
    }

    public float sumaImporteAdeudado() {
        float total = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                total += clientes[i].getSaldoAdeudado();
            }
        }

        return total;
    }

    public int ventasSuperiorA(float importe) {
        int cant = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].getImporteVenta() > importe) {
                    cant++;
                }
            }
        }

        return cant;
    }
}

package lc3_parcial1_111610;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class EstacionServicio {

    private String nombreEstacion;
    private CargaCombustible cargas[];

    //CONSTRUCTOR
    public EstacionServicio(String nombreEstacion, int cantCargas) {
        this.nombreEstacion = nombreEstacion;
        cargas = new CargaCombustible[cantCargas];
    }

    //METODOS
    //Agrega una carga al arreglo;
    public void agregarCarga(CargaCombustible carga) {
        for (int i = 0; i < cargas.length; i++) {
            if (cargas[i] == null) {
                cargas[i] = carga;
                break;
            }

        }
    }

    //Devuelve el mayor importe abonado
    public float mayorImporte() {
        float mayor = 0;
        for (int i = 0; i < cargas.length; i++) {
            if (cargas[i] != null) {
                if (cargas[i].getImporteCarga() > mayor) {
                    mayor = cargas[i].getImporteCarga();
                }
            }
        }

        return mayor;
    }

    //Devuelve la cantidad total de litros cargados
    public float sumaLtsCargados() {
        float total = 0;
        for (int i = 0; i < cargas.length; i++) {
            if (cargas[i] != null) {
                total += cargas[i].getLitrosCarga();
            }
        }

        return total;
    }

    //Devuelve la cantidad de cargas con kilometraje menor al especificado por usuario
    public int cargasKmsPorDebajo(int kmsRecorridos) {
        int cant = 0;
        for (int i = 0; i < cargas.length; i++) {
            if (cargas[i] != null) {
                if (cargas[i].getKmsRecorridos() < kmsRecorridos) {
                    cant++;
                }
            }
        }
        return cant;
    }

    @Override
    public String toString() {
        String cadena = "Estación " + nombreEstacion + " - Cargas:";
        for (int i = 0; i < cargas.length; i++) {
            if (cargas[i] != null) {
                cadena += "\n\t" + cargas[i].toString();
            }            
        }
        
        return cadena;
    }
    
    
}

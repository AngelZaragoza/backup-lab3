
package lc3_parcial1_111610;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class CargaCombustible {
    private int kmsRecorridos;
    private float litrosCarga;
    private float importeCarga;

    
    //CONSTRUCTOR
    public CargaCombustible(int kmsRecorridos, float litrosCarga, float importeCarga) {
        this.kmsRecorridos = kmsRecorridos;
        this.litrosCarga = litrosCarga;
        this.importeCarga = importeCarga;
    }

    //GETTERS
    public int getKmsRecorridos() {
        return kmsRecorridos;
    }

    public float getLitrosCarga() {
        return litrosCarga;
    }

    public float getImporteCarga() {
        return importeCarga;
    }

    @Override
    public String toString() {
        String cadena = "Lts. Comb: " + litrosCarga +
                ". Kms. desde última carga: " + kmsRecorridos +
                ". $" + importeCarga; 
        return cadena;
    }
    
    
    
}

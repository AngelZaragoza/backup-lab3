
package lc3_parcial2019_noche;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Jugador {
    private String nombreJugador;
    private Apuesta[] apuestas;

    //CONSTRUCTOR
    public Jugador(String nombreJugador, int cantApuestas) {
        this.nombreJugador = nombreJugador;
        apuestas = new Apuesta[cantApuestas];
        
    }
    
    
    //METODOS
    public void agregarApuesta(Apuesta apu) {
        for (int i = 0; i < apuestas.length; i++) {
            if(apuestas[i] == null) {
                apuestas[i] = apu;
                break;
            }            
        }
        
    }
    
    //Devuelve la cantidad de apuestas ganadas
    public int cantApuestasGanadas() {
        int cant = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if(apuestas[i] != null) {
                if(apuestas[i].getNroApostado() == apuestas[i].getNroGanador()) {
                    cant++;                    
                }                
            }            
        }
        
        return cant;
    }
    
    //Devuelve el total de dinero ganado (o perdido) del jugador
    public float totalGanado() {
        float total = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if(apuestas[i] != null) {
                
                if(apuestas[i].getNroApostado() == apuestas[i].getNroGanador()) {
                    total += apuestas[i].getDinero() * 36;
                } else {
                    total -= apuestas[i].getDinero();
                }                
            }
            
        }        
        
        return total;       
        
    }
    
    //DEvuelve la cantidad de veces que salió favorecido determinado numero
    public int salioNumero(int numero) {
        int cant = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i] != null) {
                if(apuestas[i].getNroGanador() == numero) {
                    cant++;                    
                }                
            }
            
        }        
        
        return cant;
    }
    
    //Devuelve dinero apostado a nros pares
    public float sumaApostadaPares() {
        float total = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if(apuestas[i] != null) {
                if(apuestas[i].getNroApostado() % 2 == 0) {
                    total += apuestas[i].getDinero();                    
                }                
            }            
        }        
        
        return total;
    }

    @Override
    public String toString() {
        String cadena = "Nombre: " + nombreJugador;
        for (int i = 0; i < apuestas.length; i++) {
            if(apuestas[i] != null) {
                cadena += "\n" + apuestas[i].toString();
            }
        }
        
        return cadena;
    }  
    
    
}

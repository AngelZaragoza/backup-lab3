/*
---------------------------------------
Guía de Ejercicios Unidad 2
Arreglos y Colecciones - Ej: 4
---------------------------------------
*/

package lc3_un02_biblioteca;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Biblioteca {
    private Libro[] libros;
    
    //CONSTRUCTORES
    public Biblioteca (int cantidad) {
        libros = new Libro[cantidad];
    }
    
    public void agregarLibro(Libro nuevoLibro) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null)
            {
                libros[i] = nuevoLibro;
                break;
            }            
        }       
        
    }
    
    //Devuelve un valor que representa la posicion de un Libro en el arreglo.
    //Devuelve -1 si el Libro especificado no está en el arreglo.
    public int existeLibro(String titulo) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                if (libros[i].getTitulo().equals(titulo)) {
                    return i;
                }
            } else {
                break;                
            }            
        }
        return -1;
    }
    
    //Agrega un objeto Prestamo al arreglo de Libros
    public void agregarPrestamo(String titulo, Prestamo prestamo) {
        int i = existeLibro(titulo);
        if (i >= 0) {
            libros[i].agregarPrestamo(prestamo);
        }
    }
    
    /*
      Nombre de todos los solicitantes de un libro en particular
    identificado por su título */
    public String listadoSolicitantes(String titulo) {
        String solicitantes = "\tEl Libro no existe o no está cargado";
        
        //Busca el libro pasandole el título como parámetro
        int i = existeLibro(titulo);

        if (i >= 0) {
            solicitantes = "Solicitantes de " + titulo + "\n";
            solicitantes += libros[i].listadoSolicitantes();            
        }               
        
        return solicitantes;        
    }
    
    //Método para registrar Extravio (no solicitado en las consignas)
    public String registrarExtravio(String titulo, String confirma) {
        String cadena = "\tEl Libro no existe o no está cargado";
        //Busca el libro pasandole el título como parámetro
        int i = existeLibro(titulo);
        
        if (i >= 0) {
            if (confirma.equals("s") || confirma.equals("S")) {
                libros[i].registrarExtravio();
                cadena = libros[i].getTitulo() + " - Extraviado";
            } else {
                cadena = "Operación cancelada";
            }
        }
        
        return cadena;
    }
    
    //   Cantidad de libros en cada estado (tres totales) 
    public int[] estadoLibros() {
        int [] estadoLibros = {0,0,0};
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                switch(libros[i].getEstado()) {
                    case 1:
                        estadoLibros[0]++;
                        break;
                    case 2:
                        estadoLibros[1]++;
                        break;
                    case 3:
                        estadoLibros[2]++;
                        break;
                }                    
            }            
        }
        
        return estadoLibros;
    }
    
    //   Sumatoria del precio de reposición de todos los libros extraviados 
    public float sumaPrecioExtraviados() {
        float totalExt = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                if(libros[i].getEstado() == 3)
                    totalExt += libros[i].getPrecio();
            }            
        }
        
        return totalExt;
    }
    
    @Override
    public String toString() {
        String cadena = "Lista de Libros en poder de la Biblioteca:\n";
        for (int i = 0; i < libros.length; i++) {            
            if (libros[i] != null) {
                cadena += "\t" + libros[i].toString() + "\n";
            }            
        }   
        
        return cadena;
    }
}

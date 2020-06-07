
package lc3_un01_triangulos;

/**
 *
 * @author Zaragoza Angel Gabriel
 */

/*
---------------------------------------
Guía de Ejercicios Un. 1 - POO - Ej: 5
---------------------------------------
*/

public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    
    //CONSTRUCTORES
    public Triangulo() {
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
    }
        
    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
    
    //METODOS
    public int calcPerimetro() {
        if (ladoA != 0 && ladoB != 0 && ladoC != 0)
            return ladoA + ladoB + ladoC;
        else
            return -1;
    }
    
    public String muestraPerimetro() {
        int perim = calcPerimetro();
        if (perim == -1)
            return "Debe cargar los lados del tríangulo";
        if (perim > 10)
            return "El perimetro es MAYOR a 10";
        else
            return "El perímetro es MENOR a 10";
    }
    
    @Override
    public String toString() {
        return "Lado A: " + ladoA + " Lado B: " + ladoB + " Lado C: " + ladoC;
    }
}
/*
2. En un banco hay dos tipos de cuentas: cajas de ahorro y cuentas corrientes.
Programar una clase Cuenta y dos derivadas correspondientes a cada uno de los
tipos de cuenta.
La clase Cuenta debe poseer dos métodos para operar con las mismas llamados
Depositar y Extraer.
Las cajas de ahorro no permiten extracciones si el saldo no es suficiente, mientras
que las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo
negativo admisible. La clase cuenta debe poseer al menos los atributos número,
nombre y saldo.
 */
package paquete_banco_ejerc2_unid3;

/**
 *
 * @author Usuario
 */
/*abstract -->poseer dos métodos para operar con las mismas llamados
Depositar y Extraer. */
public abstract class Cuenta {

    protected int numero;//PRIVATE P MANTENER EL ENCAPSULAMIENTO
    protected float saldo;//PROTECTED PUEDE SER UTILIZADO EN LA MISMA CLASE O EN CLASES HIJAS
    protected String nombre;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta(int numero, float saldo, String nombre) {
        this.numero = numero;
        this.saldo = saldo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tarjeta: " + "\nnumero= " + numero + "\nsaldo= " + saldo + "\nnombre= " + nombre;
    }

    public abstract String Extraer(float importe);

    public abstract String Depositar(float importe);

}

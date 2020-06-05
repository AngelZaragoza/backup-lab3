
package paquete_banco_ejerc2_unid3;

import java.util.ArrayList;

public class Banco {
    ArrayList<Cuenta>cuentas;
    
    public Banco(){
         cuentas=new ArrayList();
    }
    public void AgregarCuenta(Cuenta c){
        cuentas.add(c);
    }
    //deposito y extraccion importes en base a numero y tipo de tarjeta
    //si es 0, tipo es CC.- y si es 1 tipo de CA
    public String Depositar(int tipo, int numero, float importe){//va devolver un string
       String mensaje="";
        if (tipo==0) {
            for (Cuenta c : cuentas) {
                if (c instanceof CuentaCorriente && c.getNumero() == numero) {
                     mensaje=c.Depositar(importe);//va igualar lo q devuelva a depositar si se pudo depositar o no y cual es el saldo
                }
            }
        }else if (tipo==1){
            for (Cuenta c : cuentas) {
                if (c instanceof Caja_de_Ahorro && c.getNumero() == numero) {
                     mensaje=c.Depositar(importe);//va igualar lo q devuelva a depositar si se pudo depositar o no y cual es el saldo
                }
            }
        }
        return mensaje;
    }
    
    public String Extraer(int tipo, int numero, float importe){//va devolver un string
       String mensaje="";
        if (tipo==0) {
            for (Cuenta c : cuentas) {
                if (c instanceof CuentaCorriente && c.getNumero() == numero) {
                     mensaje=c.Extraer(importe);//va igualar lo q devuelva a depositar si se pudo depositar o no y cual es el saldo
                }
            }
        }else if (tipo==1){
            for (Cuenta c : cuentas) {
                if (c instanceof Caja_de_Ahorro && c.getNumero() == numero) {
                     mensaje=c.Extraer(importe);//va igualar lo q devuelva a depositar si se pudo depositar o no y cual es el saldo
                }
            }
        }
        return mensaje;
    }
    
    public float SaldoCuentaCorriete(){
        float suma=0f;
        for (Cuenta c : cuentas) {
            if (c instanceof CuentaCorriente) {
                suma+=c.getSaldo();
            }  
        }
        return suma;
    }
    public float PromedioSaldoCorriente(){
        float suma=0f;
        int cc=0;//contador
        for (Cuenta c : cuentas){
            if (c instanceof CuentaCorriente) {
                suma+=c.getSaldo();//acumulador
                cc++;
            }
        }
        return suma/cc;
    }
          
    
}

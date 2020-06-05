/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_banco_ejerc2_unid3;


///////CLASE HIJA CAJA DE AHORRO DE CUENTA/////
public class Caja_de_Ahorro  extends Cuenta{
    //no tiene ningun atributo
    //CONSTRUCTOR
    public Caja_de_Ahorro(int numero, float saldo, String nombre) {
        super(numero, saldo, nombre);
    }

    @Override
    public String toString() {
        return super.toString(); //<--cambio "Caja_de_Ahorro{" + '}';
    }
    
    @Override
    public String Depositar(float importe){//click override
        String mensaje="";
        this.saldo=this.saldo +importe;
        
        mensaje="el deposito se realizo correctamente. su saldo es: "+this.saldo;
        return mensaje;
    }
    @Override
    public String Extraer (float importe){//click override
        String mensaje="";
        if (this.saldo>importe) {
            this.saldo=this.saldo-importe;
            mensaje="Extraccion exitosa. su saldo es: "+this.saldo;
        }else{
            mensaje="Su saldo insuficiente. su saldo es: "+this.saldo;
        }
        return mensaje;
    }
   
}

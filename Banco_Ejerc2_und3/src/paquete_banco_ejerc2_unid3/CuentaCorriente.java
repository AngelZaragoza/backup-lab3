/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_banco_ejerc2_unid3;

///CLASE HIJA CTA CTE DE CUENTA///
public class CuentaCorriente extends Cuenta{
    private float limite; //atributo acuerdo

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    //CONSTRUCTOR
    public CuentaCorriente(int numero, float saldo, String nombre,float limite) {
        super(numero, saldo, nombre);//ATRIBUTOS HEREDADOS
        this.limite = limite;//ATRUBUTO DE CTA CTE
    }

    @Override
    public String toString() {
        return super.toString() + "\nlimite= " + limite;
        
    }
    @Override//sobreescribiendo un metodo abstracto de la clase padre
    public String Depositar (float importe){
        String respuesta="";//saldo:1000-pago 100= 900
        this.saldo = this.saldo - importe;
        respuesta="el pago se realizo con exito. su saldo es: "+ this.saldo;
        return respuesta;
    }
    
    @Override
    public String Extraer(float importe){
        String respuesta="";
        if (importe<=this.limite) {
            this.limite=this.limite-importe; //descontar al limite q tenemos p saber cuanto le va a quedar
            this.saldo=this.saldo + importe;
            
            respuesta="la compra realizada con exito. su limite es: "+this.limite+" y su saldo: "+this.saldo;
            
        }else{
            respuesta="Limite insuficiente. su limite es: "+this.limite;
        }
        return respuesta;
    }
    
}

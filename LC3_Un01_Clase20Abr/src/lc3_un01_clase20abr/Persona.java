package lc3_un01_clase20abr;

/*
---------------------------------------
Guía de Ejercicios Un. 1 - POO - Ej: 1
---------------------------------------
1.  Agregar  a  la  clase  persona  un método  que  retorne  su  índice  de masa 
corporal. Este último dato se calcula como: 

IMC = peso / altura2 
*/

public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int dni;
    private double altura;
    private double peso;
    private int anioNacimiento;
    
    //CONSTRUCTORES

    public Persona()
    {}
    
    public Persona(String nombre, String apellido, int dni, int nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anioNacimiento = nacimiento;
    }
    

    //METODOS
    //ModifDeAcceso tipoDato -> void o tipo de dato primitivo o clase 
    //
    
    public double obtenerIMC()
    {
        return peso / (altura * altura);        
    }
    
    //Ver como implementar manejo de fechas
    public int edad () {
        return 2020 - anioNacimiento;        
    }
    
    //GETTERS Y SETTERS
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String valor)
    {
        nombre = valor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
        

    @Override
    public String toString() {
        return "Nombre Completo: " + nombre + " " + apellido +
                " - DNI: " + dni + "\nEdad: " + edad() +
                " - IMC: " + String.format("%.2f",obtenerIMC());
    }        
    
}

package lc3_un01_clase20abr;

public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int dni;
    private double altura;
    private double peso;
    
    //CONSTRUCTORES

    public Persona()
    {}
    
    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    

    //METODOS
    //ModifDeAcceso tipoDato -> void o tipo de dato primitivo o clase 
    //
    
    public double obtenerIMC()
    {
        return peso / (altura * altura);
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
                " - DNI: " + dni + " - IMC: " + obtenerIMC();
    }
    
    
    
    
}

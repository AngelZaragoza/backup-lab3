/*
---------------------------------------
Guía de Ejercicios Unidad 2
Arreglos y Colecciones - Ej: 2
---------------------------------------
2. Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización 
de un software para obtener resultados sobre sus clientes y sus
respectivas mascotas. (Suponer que cada cliente posee una sola mascota) 
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente,
un nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y
una Mascota. De la Mascota se dispone los siguientes datos: el nombre y la edad. 
El software requiere cargar un número n de Clientes (este valor deberá ser cargado 
por teclado). Almacenar la información de los clientes en un arreglo. 

Se pide: 
 Mostrar la cantidad de clientes. 
 Mostrar el promedio de edad de las mascotas. 
 Informar cuántos clientes tienen una antigüedad mayor igual a 5 años. 
*/

package lc3_un02_veterinaria;

import java.util.Scanner;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class LC3_Un02_Veterinaria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0, cincoAnios = 0, codigo = 0;
        float acumEdad = 0;

        //Solicitamos cant clientes al usuario
        System.out.print("Ingrese cant. de clientes -> ");
        n = teclado.nextInt();

        if (n > 0) {
            //Creamos los arreglos
            Cliente[] clientes = new Cliente[n];
            n = 0; //La vamos a usar como contador
            for (int i = 0; i < clientes.length; i++) {

                //Alta cliente y carga de datos            
                System.out.print("Ingrese CÓDIGO del cliente, \"0\" para terminar -> ");
                codigo = teclado.nextInt();
                if (codigo != 0) {
                    n++;
                    clientes[i] = new Cliente();
                    clientes[i].setCodigo(codigo);
                    teclado.nextLine();
                    System.out.print("  Cód " + codigo + " - NOMBRE del Cliente -> ");                    
                    clientes[i].setNombre(teclado.nextLine());
                    System.out.print("  Cód " + codigo + " - ANTIGÜEDAD del Cliente -> ");                    
                    clientes[i].setAntiguedad(teclado.nextInt());
                    //Incrementamos contador si tiene más de 5 años de antigûedad
                    if (clientes[i].getAntiguedad() >= 5) {
                        cincoAnios++;
                    }                    

                    //Alta mascota y carga de datos
                    String nomMasc;
                    int edadMasc;
                    teclado.nextLine();
                    System.out.print("  Cód " + codigo + " - NOMBRE de la Mascota -> ");                    
                    nomMasc = teclado.nextLine();
                    System.out.print("  Cód " + codigo + " - EDAD de la Mascota -> ");                    
                    edadMasc = teclado.nextInt();

                    Mascota masc = new Mascota(codigo, nomMasc, edadMasc);

                    //Acumulamos edad de la Mascota y asignamos al dueño correspondiente
                    acumEdad += edadMasc;
                    clientes[i].agregarMascota(masc);
                } else {
                    System.out.println("------------------**FIN**------------------");
                    break;
                }
            }

            //Mostramos el contenido del arreglo para verificar antes de los calculos
            if (n > 0) {
                for (int i = 0; i < clientes.length; i++) {
                    if (clientes[i] != null) {
                        System.out.println(clientes[i].toString());
                    } else {
                        break;
                    }
                }

                //Calculamos promedio de edad de las mascotas
                float promEdad = acumEdad / n;

                //Mostramos la información solicitada
                System.out.println("\n------------------------------------");
                System.out.println("Cantidad de Clientes cargados: " + n);
                System.out.println("Promedio de Edad de las Mascotas: " + promEdad);
                System.out.println("Clientes con 5 o más años de Antigüedad: " + cincoAnios);
            }

        } else {
            System.out.println("------------------**FIN**------------------");
        }

    }    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej.pkg01;

import java.util.Scanner;

/**
 *
 * @author ulises
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //-Se crea una variable "Scanner" utilizada para leer los datos del usuario por teclado
       //-Emula la función "leer" del PsInt
       Scanner leer = new Scanner(System.in);
       //Creamos una variable de tipo "String" que permite leer datos del usuario al ser una variable de tipo
       //cadena de caracteres
       String nombre;
       //Mostramos un mensaje por pantalla pidiendo el nombre del usuario
        System.out.println("ingresa tu nombre");
        //Le asignamos el valor a "nombre" el valor de "leer", el cual contiene el nombre del usuario ingresado
        //por teclado
        nombre = leer.next();
        //Por ultimo mostramos el resultado por pantalla con un saludo, el valor que le dimos a la variable 
        //"nombre" que es el nombre del usuario ingresaod por teclado y el resto del mensaje
        System.out.println("Hola a todos! Soy " + nombre + " y éste es mi primer progama en Java!");
    }
    
}

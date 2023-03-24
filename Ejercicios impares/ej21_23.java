/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 19/03/23           *
 * Fecha Actualización:	20/03/23	  *
 * Descripción: Ejercicios 21, 23     *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej21_23 {
public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Ejercicio 21 *************************************************************************");
		int num1;
		int num2;
		System.out.print("Inserte un valor para el número 1: ");
		num1 = ent.nextInt();
		System.out.print("Inserte un valor para el número 2: ");
		num2 = ent.nextInt();
		if(num1 > num2){
		    System.out.println("El número 1 es mayor que el núero 2");
		}else{
		    System.out.println("El número 2 es mayor que el número 1");
		}
			
		System.out.println("");
		System.out.println("Ejercicio 23 *************************************************************************");
		int numerito;
		
		System.out.print("Inserte un número entero: ");
		numerito = ent.nextInt();
		if (numerito % 3 == 0){
		    System.out.println("El número es múltiplo de 3");
		}else{
		    System.out.println("El número no es múltiplo de 3");   
		}
		if (numerito % 5 == 0){
		    System.out.println("El número es múltiplo de 5");
		}else{
		    System.out.println("El número no es múltiplo de 5");   
		}

	}
}

/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 19/03/23           *
 * Fecha Actualización:	20/03/23	  *
 * Descripción: Ejercicios 15, 17, 19 *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej15_17_19 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ejercicio 15 *************************************************************************");
		int ncifras;
		int vari;
		System.out.print("Inserte un número con mínimo 3 cifras: ");
		vari = ent.nextInt();
		String cadena = Integer.toString(vari);
		System.out.print("Cuantas cifrasdesea eliminar? ");
		ncifras = ent.nextInt();
		System.out.print("El número sin las " + ncifras + " cifras es: ");
		for (int i = 0;i < (cadena.length())-ncifras ; i++)
		    System.out.print(cadena.charAt(i));
		
		System.out.println("");
		System.out.println("Ejercicio 17 *************************************************************************");
		int num;
		System.out.print("Inserte un número entero: ");
		num = ent.nextInt();
		if (num % 2 == 0){
		    System.out.println("El número es par");
		}else{
		    System.out.println("El número es impar");   
		}
			
		System.out.println("");
		System.out.println("Ejercicio 19 *************************************************************************");
		int numero;
		System.out.print("Inserte un número entero: ");
		numero = ent.nextInt();
		if (numero % 10 == 0){
		    System.out.println("El número es múltiplo de 10");
		}else{
		    System.out.println("El número no es múltiplo de 10");   
		}
	}
}

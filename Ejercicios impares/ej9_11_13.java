/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 19/03/23           *
 * Fecha Actualización:	20/03/23	  *
 * Descripción: Ejercicios 9, 11, 13  *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej9_11_13 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		Scanner cad = new Scanner(System.in);
		System.out.println("Ejercicio 9 *************************************************************************");
		float base;
		float altura;
		System.out.print("Dame el valor de la base: ");
		base = ent.nextFloat();
		System.out.print("Dame el valor de la altura: ");
		altura = ent.nextFloat();
		System.out.println("El área del triangulo es: " + (base * altura)/2);
			
		System.out.println("");
		System.out.println("Ejercicio 11 *************************************************************************");
		int num;
		System.out.print("Inserte un número de almenos 5 cifras: ");
		num = ent.nextInt();
		String cadena = Integer.toString(num);
		for (int i = 0; i < cadena.length(); i++){
			System.out.print(cadena.charAt(i) + " ");
		} 
				
		System.out.println("");
		System.out.println("Ejercicio 13 *************************************************************************");
		int dia;
		String mes;
		int anio;
		int ale = (int)(Math.random()*100+1);
		System.out.print("Inserte el día de su nacimiento: ");
		dia = ent.nextInt();
		System.out.print("Inserte su mes de nacimiento: ");
		mes = cad.nextLine();
		System.out.print("Inserte el año de su nacimiento: ");
		anio = ent.nextInt();
		System.out.println("Su número de la suerte a partir de su fecha de nacimiento " + dia + "/" + mes + "/" + anio + " es: " + ale);
	}
}

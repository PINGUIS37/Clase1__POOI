/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 19/03/23           *
 * Fecha Actualización:	20/03/23	  *
 * Descripción: ejercicios 1, 3, 5, 7 *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej1_3_5_7 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Scanner cad = new Scanner(System.in);
		System.out.println("Ejercicio 1 *************************************************************************");
		int n1;
		int n2;
		System.out.print("Deme el número 1: ");
		n1 = ent.nextInt();
		System.out.print("Deme el número 2: ");
		n2 = ent.nextInt();
		System.out.println("El número 1 es: " + n1);
		System.out.println("El número 2 es: " + n2);
		
		System.out.println("");
		System.out.println("Ejercicio 3 *************************************************************************");
		int n3;
		System.out.print("Inserte un número entero: ");
		n3 = ent.nextInt();
		System.out.println("El doble de " + n3 +" es:" + (n3*2));
		System.out.println("El triple de " + n3 +" es:" + (n3*3));
		
		System.out.println("");
		System.out.println("Ejercicio 1 *************************************************************************");
		float radio;
		System.out.print("Inserte el valor del radio: ");
		radio = ent.nextFloat();
		System.out.println("La longitud de la circunferencia es: " + (2*3.1416*radio) + ", y el valor del area es: " + (3.1416*(Math.pow(radio,2))));
		
		System.out.println("");
		System.out.println("Ejercicio 1 *************************************************************************");
		float cata;
		float cato;
		System.out.print("Dame el valor del cateto adyacente: ");
		cata = ent.nextFloat();
		System.out.print("Dame el valor del cateto opuesto: ");
		cato = ent.nextFloat();
		System.out.print("El valor de la hipotenusa es: " + Math.sqrt(Math.pow(cata,2)+Math.pow(cato,2)));

	}
}

/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Ejercicios 25, 27     *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej25_27 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Scanner cad = new Scanner(System.in);
		System.out.println("Ejercicio 25 *************************************************************************");
		String carac;
		System.out.print("Inserte una letra: ");
		carac = cad.nextLine();
		if(carac.equals(carac.toUpperCase())){
		    System.out.println("El caracter es mayúscula");
		}else{
		    System.out.println("El caracter no es mayúscula");
		}
		
		System.out.println("");
		System.out.println("Ejercicio 27 *************************************************************************");
		String caracdoble;                                                         
		char primcar;                                                              
		char seguncar;                                                                                                                                   
		System.out.print("Inserte dos letras");                                    
		caracdoble = cad.nextLine();
		primcar = caracdoble.charAt(0);
		seguncar = caracdoble.charAt(1);
		if(primcar.equals(primcar.toLowerCase())){
		    if(seguncar.equals(seguncar.toLowerCase())){
		        System.out.println("Los dos caracteres son minúsculas");
		    }else{
		        System.out.println("El primer caracter es minúscula");
		    }
		}else{
		    if(seguncar.equals(seguncar.toLowerCase())){
		         System.out.println("El segundo caracter es minúscula");
		    }else{
		         System.out.println("Los dos caracteres son mayúsculas");
		    }
		}
		System.out.println("");
		System.out.println("Ejercicio 27 *************************************************************************");
		
	}
}

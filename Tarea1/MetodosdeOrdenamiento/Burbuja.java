/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 19/03/23           *
 * Fecha Actualización:	20/03/23	  *
 * Descripción: Método burbuja        *
 **************************************/

package MetodosdeOrdenamiento;
import java.util.Scanner;

public class Burbuja{

	public static void main (String[] args) {
		
        Scanner ent = new Scanner(System.in);
		//Creación de identificadores
		int auxiliar;
		int n;
		int cadena[];
		
		//Mensaje para pedir la longitud de la cadena
		System.out.print("Escriba el número de elementos de la cadena: ");		
		n = ent.nextInt();

		//Aquí se crea la cadena con el número dado por el usuario
		cadena = new int[n];	

		//Aquí se llena la cadena
		for(int i = 0 ; i < n ; i++){
		System.out.println("\nEscriba el número para la posición: " + (i+1));
			cadena[i] = ent.nextInt();
		}
	
		//Impresión de la cadena dada
		System.out.println("\nLa cadena ingresada es: ");
		for(int i=0 ; i < n ; i++){
			if(i < n-1){
                System.out.print(cadena[i] + ", ");
            }else{
                System.out.print(cadena[i]);
            }
		}

		//Ordenación con el método burbuja
		for(int i = 0 ; i < (n - 1) ; i++) {
			for(int j = 0 ; j < (n-1) ; j++) {
				if(cadena[j] > cadena[j+1]) {
					auxiliar = cadena[j];
					cadena[j] = cadena[j+1];
					cadena[j+1] = auxiliar;
				}
			}
		}

		//Imprimiendo el cadena ya ordenado
		System.out.println("\nLa cadena ordenada es: ");
		for(int i=0 ; i < n ; i++){
			if(i < n-1){
                System.out.print(cadena[i] + ", ");
            }else{
                System.out.print(cadena[i]);
            }
            
		}

		System.out.println(" ");
	}
}
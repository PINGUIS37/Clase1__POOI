/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 19/03/23           *
 * Fecha Actualización:	20/03/23	  *
 * Descripción: Método burbuja        *
 **************************************/

package MetodosdeOrdenamiento;

import java.util.Scanner;

public class Segundo_metodo {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
        int[] vals;
        int n;
        
        System.out.print("Escriba el número de elementos de la cadena: ");		
		n = ent.nextInt();
		
		vals = new int[n];
        
        for(int i = 0 ; i < n ; i++){
    		System.out.println("\nEscriba el número para la posición: " + (i+1));
    			vals[i] = ent.nextInt();
    		}
        
        for (int i = 0; i < vals.length; i++) {
            for (int j = i; j < vals.length; j++) {
                if (vals[i] > vals[j]) {
                    Integer aux = vals[j];
                    vals[j] = vals[i];
                    vals[i] = aux;
                }
            }
        }
        
        System.out.println("\nLa cadena ordenada es: ");
        for (int val : vals) {
        	System.out.println(val);
        }
    }
}


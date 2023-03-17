/***************************************
 * Autor: Yael Alberto Gómezz Hernández*
 * Fecha Creación: 17/03/2023          *
 * Fecha Actualización: 17/03/2023     *
 * Descripción: recorrido de un arreglo*
 * 				unidimensional. 
 **************************************/

package arreglos;

public class arreglos {
	private byte []arregloByte = {7, 6, 5, 4, 3, 2, 1, 0};
	private short arregloshort[] = {2, 4, 6, 8, 10};
	private int arregloInt[] = new int[10];
	private long arregloLong[] = new long[3];
	private char []arregloChar = {'H', 'O','L', 'A', ' ', 'J', 'A', 'V', 'A'};
	private static char arregloPal[] = {'A', 'N', 'I', 'T', 'A', 'L', 'A', 'V', 'A', 'L', 'A', 'T', 'I', 'N', 'A'};
	private static boolean esPalindromo = true;
	
	public static void main(String[] args) {
		for (int i = 0, j = arregloPal.length - 1; i < arregloPal.length/2; i++, j--) {
			if (arregloPal[i] != arregloPal[j]) {
				esPalindromo = false;
				break;
			}	
		}
		
		if (esPalindromo) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		
	}
}

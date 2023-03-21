package arreglos;
import java.util.Scanner;

public class burbuja{
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
        Scanner ent = new Scanner(System.in);
		//Creación de identificadores
		int auxiliar;
		int n;
		int cadena[];
		
		//Mensaje para pedir la longitud de la cadena
		System.out.print("Escriba el número de elementos de la cadena: ");		
		n = ent.nextInt();
        System.out.println(" ");

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
			System.out.println(cadena[i] + " -");
		}

		//Ordenación con el método burbuja
		for(int i = 0 ; i < (n - 1) ; i++) {
			for(int j = 0 ; j < (n-1) ; j++) {
				if(cadena[j] > cadena[j+1]) {
					auxiliar = arreglo[j];
					cadena[j] = cadena[j+1];
					cadena[j+1] = auxiliar;
				}
			}
		}

		//Imprimiendo el cadena ya ordenado
		System.out.println("\nLa cadena ordenada es: ");
		for(int i=0 ; i < n ; i++){
			if(i < n-1){
                System.out.println(cadena[i] + ", ");
            }else{
                System.out.println(cadena[i]);
            }
            
		}

		System.out.println(" ");
	}
}
/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Ejercicios 49, 51     *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej49_51 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Scanner cad = new Scanner(System.in);
		System.out.println("Ejercicio 49 *************************************************************************");
        float millas;
        System.out.print("Inserte las millas: ");
        millas = ent.nextInt();
        System.out.print( millas + " millas, equivalen a: " + (millas*1.60934) + " Kilómetros");
        
        System.out.println("");
		System.out.println("Ejercicio 51 *************************************************************************");
        int cont = 0;
        int n;
        int num;
        System.out.print("Inserte el número de digitos a valorar: ");
        n = ent.nextInt();
        for (int i=0; i < n; i++){
            System.out.print("Inserte el número a valorar: ");
            num = ent.nextInt();
            if(num > 0){
                cont++;
            }
        }
        System.out.print("Cantidad de números positivos: " + cont);
	}
}

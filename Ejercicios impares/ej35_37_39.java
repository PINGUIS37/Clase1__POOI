/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Ejercicios 35, 37, 39 *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej35_37_39 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ejercicio 29 *************************************************************************");
		int mes = 0;
		while(mes < 1 || mes > 12){
			System.out.print("Inserte un mes: ");
			mes = ent.nextInt();
		}
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			System.out.println("El mes contiene 31 días");
		}else{
			if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
				System.out.println("El mes contiene 30 días");    
			}else{
				System.out.println("El mes contiene 28 días");
			}
		}                                                                               
		System.out.println("");
		System.out.println("Ejercicio 31 *************************************************************************"); 
		int consec = 1;        
		while(consec <= 100){
			if(consec <= 99){
				System.out.print(consec + ", ");
			}else{
				System.out.print(consec);
			}
			consec++;
		}                                                                               
		System.out.println("");
		System.out.println("Ejercicio 31 *************************************************************************");
		int consecutivo = 1;
		for (int i = 1; i <= 100; i++) {
			if(consecutivo <= 99){
				System.out.print(consecutivo + ", ");
			}else{
				System.out.print(consecutivo);
			}
			consecutivo++;
		}
	}
}

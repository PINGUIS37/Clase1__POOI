/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Ejercicios 41,43      *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej41_43 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ejercicio 29 *************************************************************************");
        int num = 100;
        do{
            if(num >= 2){
                System.out.print(num + ", ");
            }else{
                System.out.print(num);
            }
            num--;
        }while(num > 0);                                                                
        
        System.out.println("");
		System.out.println("Ejercicio 31 *************************************************************************");
        int numero = 1;
        int lim;
        System.out.print("Inserte el limite: ");
        lim = ent.nextInt();
        for (int i = 1; i <= lim; i++) {
            if(numero <= lim-1){
                System.out.print(numero + ", ");
            }else{
                System.out.print(numero);
            }
            numero++;
        }
        numero = 1;
        System.out.println("");
        System.out.println("");
        while(numero <= lim){
            if(numero <= lim-1){
                System.out.print(numero + ", ");
            }else{
                System.out.print(numero);
            }
            numero++;
        }
        numero = 1;
        System.out.println("");
        System.out.println("");
        do{
            if(numero <= lim-1){
                System.out.print(numero + ", ");
            }else{
                System.out.print(numero);
            }
            numero++;
        }while(numero <= lim);
        System.out.println(""); 
	}
}

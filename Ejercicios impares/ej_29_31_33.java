/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Ejercicios 29, 31, 33 *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej_29_31_33 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ejercicio 29 *************************************************************************");   
        int anio;
        System.out.print("Inserte el año en el que se encuentra: ");
        anio = ent.nextInt();
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
	        System.out.println("El año es bisiesto");
        }
        else{
	        System.out.println("El año no es bisiesto");
        }
        
        System.out.println("");
		System.out.println("Ejercicio 31 *************************************************************************");
        float dividendo;
        float divisor = 0;
        System.out.print("Inserte el dividendo: ");
        dividendo = ent.nextInt();
        while(divisor == 0){
            System.out.print("Inserte el divisor: ");
            divisor = ent.nextInt();
        }
        System.out.println("El resultado de la división es: " + dividendo/divisor);          
        
        System.out.println("");
		System.out.println("Ejercicio 33 *************************************************************************");
        int[] nums = new int[3];
        int mayor = 0;
        for (int i = 0; i < 3; i++){ 
            System.out.print("Inserte un valor para el número " + (i+1) +": ");
	    	nums[i] = ent.nextInt();
	    	if(nums[i] > mayor){
	    	    mayor = nums[i];
	    	}
        }
        System.out.println("El numero mayor es: " + mayor); 
	}
}

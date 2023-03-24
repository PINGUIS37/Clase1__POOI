/**************************************
 * Autor: Yael Alberto Gómez Hernández*
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Ejercicios 45, 47     *
 **************************************/
package Impares;
import java.util.Scanner;
public class ej45_47 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Scanner cad = new Scanner(System.in);
		System.out.println("Ejercicio 45 *************************************************************************");
        int menor = 9999;
        int mayor = 0;
        int[] nums = new int[2];
        for (int i = 0; i < 2; i++){ 
            System.out.print("Inserte un valor para el número " + (i+1) +": ");
	    	nums[i] = ent.nextInt();
	    	if(nums[i] > mayor){
	    	    mayor = nums[i];
	    	}
        }
        for (int i = 0; i < 2; i++){
	    	if(nums[i] < menor){
	    	    menor = nums[i];
	    	}
        }
        for (int i = menor; i <= mayor; i++){
            if(i <= mayor-1){
                System.out.print(menor + ", ");
            }else{
                System.out.print(menor);
            }
            menor++;
        }                                                                               
        
        System.out.println("");
		System.out.println("Ejercicio 47 *************************************************************************");
        int inic;
        int lim;
        int aux;
        System.out.print("Inserte un número para calcular sus múltiplos: ");
        inic = ent.nextInt();
        System.out.print("Inserte un limite para calcular sus múltiplos: ");
        lim = ent.nextInt();
        aux = inic;
        while(inic < lim){
            System.out.print(inic + " ");
            inic += aux;
        }
	}
}

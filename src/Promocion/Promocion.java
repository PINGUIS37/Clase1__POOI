package Promocion;

public class Promocion {
	// Tipo		Promoción válidas
	// double 	Ninguna
	// float	double
	// long		float o double
	// int		long, float o double
	// char		int, long, float o double
	// short	int, long, float o double (no a un char)
	// byte		short, int, long, float o double (no a un char)
	// boolean	En Java los valores booleanos no se consideran como números
	
	public static void main(String[] args) {
		int resultado = (7 * (10 - 5) % 3) * 4 + 9;
		System.out.println("Resultado: " + resultado);
		
		// Incremento
		/*x = 10;
		if (x++ == 10) {
			System.out.println("hola");
		}else {
			System.out.println("adios");
		}*/
		// Postincremento
		int x = 10;
		System.out.println("Postincremento: " + x++);// Primero imprime y después incrementa
		System.out.println("x: " + x);
		
		// Preincremento
		x = 10;
		System.out.println("Preincremento: " + ++x);// Primero incrementa y después imprime
		
		
		// Postdecremento
		x = 10;
		System.out.println("Postdecremento: " + x--);// Primero imprime y después decrementa
		System.out.println("X: " + x);
		
		// Predecremento
		x = 10;
		System.out.println("Predecremento: " + --x);// Primero decrementa y después imprime
		System.out.println("X: " + x);
		
		
		
		
		
		// Desplazamiento
		
		// Desplazamiento a la derecha
		x= 15;
		System.out.println("Desplazamiento derecha: " + (x >> 1)); // Lo transforma a binario y despues a decimal 
		
		// Desplazamiento a la izquierda
		x= 7;
		System.out.println("Desplazamiento derecha: " + (x << 1)); // Lo transforma a binario y despues a decimal
		
		// OR
		x = 10;
		int y = 15;
		System.out.println("OR: " + (x | y));
		
		// AND
		x = 10;
		y = 15;
		System.out.println("AND: " + (x & y));
		
		// XOR
		x = 10;
		y = 15;
		System.out.println("XOR: " + (x ^ y));
		
		
		
		
		
		
		
		//System.out.println(Math.sqrt(4));
	}
}

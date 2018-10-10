package utilidades;

import java.util.Scanner;

public class Ejer_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		System.out.print("Introduzca un número entero: ");
		n = teclado.nextInt();
		
		System.out.println("El numero es: "+n);



	}

}

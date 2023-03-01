package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);

	public void controlf() {

		/*
		 * if (a>b) {
		 * 
		 * }
		 */

		long nota = 4;
		if (nota > 5) {
			System.out.println("Nota aprobada" + nota);
		}

		System.out.println("continua el control");

		/*
		 * if (condition) {
		 * 
		 * } else {
		 * 
		 * }
		 */
		if (nota >= 5) {
			System.out.println("Nota aprobada" + nota);
		} else {
			System.out.println("Nota no aprobada" + nota);

		}

	}

	public void divisible() {
		System.out.println("Introduzca un numero: ");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca un segundo numero: ");
		int dato2 = entrada.nextInt();
		if (dato1 % dato2 == 0) {
			System.out.println(dato1 + " es divisible entre " + dato2);

		} else {
			System.out.println(dato1 + " No es divisible entre " + dato2);

		}

	}

	public void compara() {
		System.out.println("Introduzca un numero: ");
		int valor1 = entrada.nextInt();
		System.out.println("Introduzca un segundo numero: ");
		int valor2 = entrada.nextInt();
		if (valor1 > valor2) {
			System.out.println("el valor 1 es mayor");
		} else {
			System.out.println("el valor 2 es mayor");

		}

	}

	public void anidado() {
		System.out.println("Introduzca un numero: ");
		int num1 = entrada.nextInt();
		
		if (num1 > 0) {
			System.out.println("numero positivo " + num1);
			
		} else if (num1 < 0) {
			System.out.println("numero negativo " + num1);
		}else  {
			System.out.println("numero igual a cero " + num1);
		}
	
		
		

	}
}

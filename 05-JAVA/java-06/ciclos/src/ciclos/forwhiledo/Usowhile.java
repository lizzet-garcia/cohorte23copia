package ciclos.forwhiledo;

import java.util.Scanner;

public class Usowhile {
	Scanner entrada = new Scanner(System.in);
	public void cicloW() {
		int iterador = 0;
		while (iterador < 10) {
			System.out.println("iterador " + iterador);
			iterador = iterador + 1;
		}
		
	}
	
	/*while uso centinela*/
	public void centinelaW() {
		final int centinela = -1;
		System.out.print("introduzca una nota: ");
		int nota = entrada.nextInt();
		while (nota != centinela) {
			System.out.println("La nota es: " + nota);
			System.out.print("introduzca una nota: ");
		     nota = entrada.nextInt();
			
			
		}
		System.out.println("fin");
		

	}
	
	/*metodo estatico, no hay necesidad de crear el objeto en test pra llamarlo, se llama con el nombre de la clase*/
	
	/*control de bandera*/
	public void banderaW() {
		
		boolean valorb = false;
		while (!valorb) {
			System.out.println("Introduzca un valor numerico ");
			int valorx = entrada.nextInt();
			if (valorx > 0 && valorx < 5) {
				int potaxio = (int)Math.pow(valorx, 2);
				System.out.println("resultado es: " + potaxio);
			} else {
				valorb = true;
				System.out.println("fin");

			}
		}
		
		

	}
}

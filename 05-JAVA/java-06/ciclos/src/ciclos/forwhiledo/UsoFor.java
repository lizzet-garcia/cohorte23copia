package ciclos.forwhiledo;

import java.util.Iterator;

public class UsoFor {
	public void cicloFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("el iterador " + i);
		}

	}

	public void letrasfor() {
		/* forma 1 */
		/*
		 * for (int i = 'A'; i <= 'Z'; i++) { System.out.print("soy: " + i + ","); char
		 * letra = (char) i; System.out.println(); System.out.print("soy: " + letra); }
		 */ /* forma 2 */
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print("soy: " + (char) i + ",");
		}
	}
	
	

}

package hilos.lggr.pruebas;

import hilos.lggr.format.runnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		//proceso forma 1
		Hilo2 ht = new Hilo2("Pedro");
		Thread st = new Thread (ht);
		st.start();
		
		// proceso forma 2
		new Thread (new Hilo2("Canicula")).start();
		new Thread (new Hilo2("Mariano")).start();
		
		

	}

}

package hilos.lggr.pruebas;

import hilos.lggr.formathread.Hilo1;

public class TestThread {

	public static void main(String[] args) {
		Thread h = new Hilo1("Juan");
		h.start();
		
		Thread h0 = new Hilo1 ("Maria");
		h0.start();
		
		Thread h1 = new Hilo1 ("Petra");
		h1.start();
		
		
		System.out.println(h.getState());

	}

}

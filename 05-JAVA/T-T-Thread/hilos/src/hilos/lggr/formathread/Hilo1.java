package hilos.lggr.formathread;

public class Hilo1 extends Thread {
	
	//constructor de superclass
	public Hilo1(String name) {
		super(name);
		
	}

	//sobreescribir metodo run
	@Override
	public void run() {
		System.out.println("se inicia el thread " + this.getName());
		 
		//ciclo for
		//try catch
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
		System.out.println("finaliza el thread " + this.getName());
	}

}

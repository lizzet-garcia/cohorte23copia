package hilos.lggr.format.runnable;

//runnable es una interfaz que tiene un metodo run para implementar
public class Hilo2 implements Runnable {
	private String nombre;

//constructor
	public Hilo2(String nombre) {
		this.nombre = nombre;
	}

//getters
	public String getNombre() {
		return nombre;
	}

	// implementando metodos
	@Override
	public void run() {
		System.out.println("Inicio de Thread " + this.getNombre());
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + nombre);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}

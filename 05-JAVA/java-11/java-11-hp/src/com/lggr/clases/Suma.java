package com.lggr.clases;

public class Suma implements OperacionesAritmeticas, Mensajes {
	private double a;
	private double b;
	
	

	public Suma() {
		super();
	}

	public Suma(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double Sumar() {
		return this.a + this.b;
	}

	//se agrega pero aun no se implementa porque es la clase Suma.
	@Override
	public double Restar() {
		return 0;
	}
//metodo que viene de Mensaje
	@Override
	public void mensaje() {
		System.out.println("Hola soy una suma ");
	}

	

	
	
	

}

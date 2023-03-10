package com.lggr.clases;

public class Circulo extends FigurasGeometricas {
	private int radio;

//constructor para inicializar radio
	public Circulo(int radio) {
		super("circulo");
		this.radio = radio;
	}

	// getters y setters
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	// impementando metodo abstracto de clase padre
	@Override
	public double areas() {
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}

}

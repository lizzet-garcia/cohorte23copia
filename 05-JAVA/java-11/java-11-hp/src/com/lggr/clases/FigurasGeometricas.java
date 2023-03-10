package com.lggr.clases;

//clase abstracta
public abstract class FigurasGeometricas {
	// miembro de datos
	private String nombre;

	// contructor
	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}

	// metodo abstracto. (va a ser implementado en clase hija)
	public abstract double areas();
	
	//metodo abstractos para pedir datos
	public abstract void pedirDatos();
	
	
//to string
	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + "]";
	}

	
	
}

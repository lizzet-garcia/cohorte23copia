package com.generation.lggr.clases;

public class Persona {
	private String nombre;
	private int edad;
	private int nss;

	//constructor vacio
	public Persona() {
		super();
	}

	//constructor sobrecargado
	public Persona(String nombre, int edad, int nss) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}

}

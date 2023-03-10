package com.lggr.clases;

public class PersonaP {
	//atributos
	private String nombre;
	private int edad;
	
	//constructor
	public PersonaP(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

//getters y setters
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

	//to string
	@Override
	public String toString() {
		return "PersonaP [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	

}

package com.lggr.clases;

public class AlumnoB extends PersonaP {
	private int matricula;
	private double promedio;
	
	//constructor. se agregaron los atributos de clase padre
	public AlumnoB(int matricula, double promedio, String nombre, int edad) {
		super(nombre,edad);
		this.matricula = matricula;
		this.promedio = promedio;
	}
//getters and setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	//to string
	@Override
	public String toString() {
		return "AlumnoB [matricula=" + matricula + ", promedio=" + promedio + "]";
	}
	
	
	
	public void mostrarDatos() {
		System.out.println(this.getNombre() + " " + this.getEdad() + " " + this.matricula + " " + this.promedio);
	}
	
	//metodo sobrecargado
	public void mostrarDatos(String Apellido) {
		System.out.println(this.getNombre() + " " + this.getEdad() + " " + this.matricula + " " + this.promedio);

	}
	
	
	
	
	
	
	

}

package oop.clases;

public class Persona {
	//al agregarle private ya es un miembro de datos de la clase, y nadie mas puede tener acceso a esos atributos.
	public String nombre = "Juan";
	private int edad;
	private double altura;
	private double peso;
	private String zodiaco;
	
	//sobrecarga del metodo constructor: que el metodo puede tener o no los atributos
	public Persona() {
		super();
	}
	
	
//constructor nombre
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	
	//metodo
	public String datosPersona() {
		return this.nombre + " " + this.edad + " " + this.altura + " " + this.peso + " " + this.zodiaco;
		

	}



	//metodo constructor solo inicializando con edad y zodiaco
public Persona(int edad, String zodiaco) {
		super();
		this.edad = edad;
		this.zodiaco = zodiaco;
	}


//constructor
	public Persona(String nombre, int edad, double altura, double peso, String zodiaco) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.zodiaco = zodiaco;
	}
	//para acceder a miembros de datos de la clase (privados) puede ser con metodos accesores (get,set)
	// source --> generate getters and setters
	// se le conoce como pojo o bean
	
	
	public String getNombre() {
		return nombre;
	}
	//metodo de tipo void no necesita el return
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getZodiaco() {
		return zodiaco;
	}
	public void setZodiaco(String zodiaco) {
		this.zodiaco = zodiaco;
	}
	
	
	

}

package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Indico que mi clase Producto se convierte en una entidad JPA (persistencia de datos) 

@Table(name = "Producto") //especificar de forma correcta el nombre de la tabla.

public class Producto {
	@Id //el campo Id es la primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB

	//atributos
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private Double precio;
	
	//constructor vacio pra el Jackson (serealizar y deserealizar un obejeto java a json)
	public Producto() {
		
	}

	//constructor 
	public Producto(Long id, String nombre, String descripcion, String uRL_imagen, Double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_imagen = uRL_imagen;
		this.precio = precio;
	}
	
	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_imagen() {
		return URL_imagen;
	}

	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	//tostring (sobreescritura de metodos)
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen="
				+ URL_imagen + ", precio=" + precio + "]";
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.generation.cohorte23.jpa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String email;
	private Integer prioridad;
	
	@OneToMany(mappedBy = "usuario") //un usuario con muchos productos
	   private ArrayList<ProductoModel> producto;
	
	@OneToMany(mappedBy = "usuario") //un usuario con muchas ordenes
	   private ArrayList<OrderModel> ordenes;
	
	
	//constructor vacio
	public UsuarioModel() {
	}

	//constructor

	public UsuarioModel(Long id, String nombre, String email, Integer prioridad, ArrayList<ProductoModel> producto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.prioridad = prioridad;
		this.producto = producto;
	}

	

//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public ArrayList<ProductoModel> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<ProductoModel> producto) {
		this.producto = producto;
	}
	
	
	
	
	

}

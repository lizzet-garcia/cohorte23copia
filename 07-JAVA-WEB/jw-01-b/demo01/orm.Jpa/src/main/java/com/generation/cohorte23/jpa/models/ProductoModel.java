package com.generation.cohorte23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreProducto;
	

	//relaciones
	@ManyToOne
	private UsuarioModel usuario;
	
	  @OneToOne (mappedBy = "producto")
	    private DetalleOrdenModel detalle;

	// constructor vacio
	public ProductoModel() {
	}

	// contructor
	public ProductoModel(Long id, String nombreProducto, UsuarioModel usuario) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.usuario = usuario;
	}

	// Aqui empiezan los getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	// public Integer getUsuarioId() {
	// return usuarioId;
	// }
	// public void setUsuarioId(Integer usuarioId) {
	// this.usuarioId = usuarioId;
	// }

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

}

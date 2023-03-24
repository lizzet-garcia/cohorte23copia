package com.generation.cohorte23.app.model;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	
	/*
	//constructor vacio
	public Libro() {
	}
*/
	//constructor
	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	//getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	

}

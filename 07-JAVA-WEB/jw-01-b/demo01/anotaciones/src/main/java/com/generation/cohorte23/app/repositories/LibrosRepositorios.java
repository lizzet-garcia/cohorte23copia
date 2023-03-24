package com.generation.cohorte23.app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.generation.cohorte23.app.model.Libro;

@Repository
public class LibrosRepositorios {
	public List<Libro> listarLibros (){
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(new Libro ("Spring Boot", "Luis", "333"));
		lista.add(new Libro ("Java", "Pedro", "8888"));
		lista.add(new Libro ("The hunger games", "Suzanne Collins", "5555"));
		return lista;
	}

}
